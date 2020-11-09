package tw.group4._03_.cms.reservation.model;

import java.util.List;

public interface IShopReservationBean {
	
	public boolean checkReservationNo(ShopReservationBean bean);

	public ShopReservationBean insert(ShopReservationBean bean);

	public ShopReservationBean select(int reservationNo);

	public List<ShopReservationBean> selectByNo(int reservationNo);

	public List<ShopReservationBean> selectByName(String name);

	public List<ShopReservationBean> selectByShopName(String shopName);

	public List<ShopReservationBean> selectAll();

	public ShopReservationBean update(int reservationNo, String memberId, String name, int shopId, String shopName,
			String customerName, int adultsNum, int childrenNum, int amount, String startTime, String endTime);

	public boolean delete(int reservationNo);

}
