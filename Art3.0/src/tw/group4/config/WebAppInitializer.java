package tw.group4.config;

import javax.servlet.Filter;
import javax.servlet.FilterRegistration;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRegistration;

import org.springframework.web.context.ContextLoaderListener;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.filter.CharacterEncodingFilter;
import org.springframework.web.filter.HiddenHttpMethodFilter;
import org.springframework.web.servlet.DispatcherServlet;
import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

import tw.group4.util.OpenSessionViewFilter;

//地位等同web.xml，第二行設定及連結過去的class取代mvc-servlet.xml
//這個class包含最基本的設定
//onStartup()內可設定Server服務啟動就連帶開啟的設定，包含過濾器
public class WebAppInitializer extends AbstractAnnotationConfigDispatcherServletInitializer {

	@Override
	protected Class<?>[] getRootConfigClasses() {
		return new Class[] {RootConfig.class};
	}

	@Override
	protected Class<?>[] getServletConfigClasses() {
		return new Class[] {SpringMVCConfig.class};
	}

	@Override
	protected String[] getServletMappings() {
		return new String[] {"/"};
	}
	
//	設定request response編碼的Filter
//	設定form method="post"轉"put"和"delete"的Filter
//	此寫法當web.xml和java config同時設定，會失去作用，要用方法二filter
	@Override
	protected Filter[] getServletFilters() {
		CharacterEncodingFilter encodingFilter = new CharacterEncodingFilter();
		encodingFilter.setEncoding("UTF-8");
		encodingFilter.setForceEncoding(true);
	    HiddenHttpMethodFilter hiddenHttpMethodFilter = new HiddenHttpMethodFilter();
		
		return new Filter[] {encodingFilter, hiddenHttpMethodFilter};
	}
	
	@Override
	public void onStartup(ServletContext servletContext) throws ServletException {
		AnnotationConfigWebApplicationContext rootContext = new AnnotationConfigWebApplicationContext();
		rootContext.register(SpringMVCConfig.class);
		rootContext.setServletContext(servletContext);
		ServletRegistration.Dynamic mvc = servletContext.addServlet("mvc", new DispatcherServlet(rootContext));
		mvc.setLoadOnStartup(1);
		mvc.addMapping("/");

//		設定啟動SessionFactory之路徑的過濾器
//		在此設定過濾器映射路徑
		FilterRegistration.Dynamic sessionFilterRegistration  = servletContext.addFilter("OpenSessionViewFilter", OpenSessionViewFilter.class);
//		sessionFilterRegistration.setInitParameter("sessionFactoryBeanName", "sessionFactory");
		sessionFilterRegistration.addMappingForUrlPatterns(null, true, "*.ctrl");
//		加下面這行會害上面那行映射路徑設定失效
//		sessionFilterRegistration.addMappingForServletNames(null, true, "mvc");
		
//		編碼過濾器註冊
//		這是設定request編碼的方法二filter，設定context啟動時做什麼事
//		如果SpringWebMvc設定與xml衝突時會導致前面方法定義的過濾器失效，要啟用這個過濾器代替
//		FilterRegistration.Dynamic encodingFilterRegistration = servletContext.addFilter("encodingFilter", new CharacterEncodingFilter());
//		encodingFilterRegistration.setInitParameter("encoding", "UTF-8");
//		encodingFilterRegistration.setInitParameter("forceEncoding", "true");
//		encodingFilterRegistration.addMappingForUrlPatterns(null, false, "/*");

		servletContext.addListener(new ContextLoaderListener(rootContext));
	}

}
