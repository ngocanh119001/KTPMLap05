package com.example.demo_jpa.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.example.demo_jpa.entity.NhanVien;

@Repository
public interface NhanVienDAOImpl extends JpaRepository<NhanVien, String>{
	
//	List<NhanVien> findNhanVienByName(String Ten);
	@Query(value = "select sum(Luong) from nhanvien",nativeQuery = true)
	public int sumLuongNV();

	@Query(value = "select top 1 MaNV,MAX(Luong) from nhanvien group by MaNV",nativeQuery = true)
	public List<Object[]> listLuongMax();
	@Query(value = "select top 1 MaNV,MAX(Luong) from nhanvien group by MaNV",nativeQuery = true)
	public List<String> listbyLuongMax();

	@Query(value = "select nhanvien.MaNV,Ten,Luong from nhanvien full outer join chungnhan on nhanvien.MaNV=chungnhan.MaNV\r\n"
			+ "where chungnhan.MaNV is null",nativeQuery = true)
	public List<Object[]> listNotPhiCong();
	@Query(value = "select nhanvien.MaNV,Ten,Luong from nhanvien full outer join chungnhan on nhanvien.MaNV=chungnhan.MaNV\r\n"
			+ "where chungnhan.MaNV is null",nativeQuery = true)
	public List<String> listbyNotPhiCong();
//	@Query(value = "select *from nhanvien where Luong< :index",nativeQuery = true)
//	public List<NhanVien> listNVluong<10000(@Param(value = "index")int index);
@Query(value = "select *from nhanvien where Luong> :index",nativeQuery = true)
	public List<NhanVien> listLuongNV(@Param(value = "index")int index);
}
