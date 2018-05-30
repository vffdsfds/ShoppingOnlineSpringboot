package edu.mum.onlineshoping.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import edu.mum.onlineshoping.model.Vendor;

@Repository
public interface VendorRepository extends JpaRepository<Vendor, Long>{
	public Vendor findByUser_Username(String username);

	@Query(value="SELECT DISTINCT\r\n" + 
			"    concat(date_add(date('2018-1-1'), interval (DATE_FORMAT(o.order_date, '%u')-1)*7 day), '~'\r\n" + 
			"      , date_add(date('2018-1-1'), interval (DATE_FORMAT(o.order_date, '%u')-1)*7+7 day))\r\n" + 
			"FROM\r\n" + 
			"    orders o,\r\n" + 
			"    order_details od,\r\n" + 
			"    product p,\r\n" + 
			"    vendor v,\r\n" + 
			"    user u\r\n" + 
			"WHERE\r\n" + 
			"    od.orders_id = o.id\r\n" + 
			"        AND od.product_id = p.id\r\n" + 
			"        AND p.vendor_id = v.id\r\n" + 
			"        AND v.user_id = u.id\r\n" + 
			"        AND u.username = :username\r\n" +
			"GROUP BY DATE_FORMAT(o.order_date, '%Y%u') DESC", nativeQuery=true)
	public List<String> findWeeks(@Param("username")String username);
}