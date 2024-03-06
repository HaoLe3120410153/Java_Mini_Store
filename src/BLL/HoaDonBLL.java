/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BLL;

import DAL.HoaDonDAL;
import DTO.HoaDonDTO;
import DTO.ThanhVienDTO;
import DTO.NhanVienDTO;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author mizuk
 */
public class HoaDonBLL {
    public static List<HoaDonDTO> listHD = new ArrayList<>();
    public static List<HoaDonDTO> listExcelHD = new ArrayList<>();
    
    HoaDonDAL hoaDonDAL = new HoaDonDAL();
    
    public HoaDonBLL(){
    }
    
    public void resetListHD(){
        while(listHD.size() > 0){
            listHD.remove(0);
        }
    } 
    public void loadListHD(){
        listHD = new HoaDonDAL().getData();
    }
    public List<HoaDonDTO> getList(){
        return this.listHD;
    }
    public List<HoaDonDTO> getListExcel(){
       return this.listExcelHD;
    }
    public void resetListExcel(){
        while(!listExcelHD.isEmpty()){
            listExcelHD.remove(0);
        }
    }
    public void updateListExcel(HoaDonDTO hoaDonDTO) {
        listExcelHD.add(new HoaDonDTO(
                hoaDonDTO.getMa_hoa_don(),
                hoaDonDTO.getNgay_xuat(),
                hoaDonDTO.getMa_nhan_vien(),
                hoaDonDTO.getMa_thanh_vien(),
                hoaDonDTO.getTong_tien(),
                hoaDonDTO.getTien_giam(),
                hoaDonDTO.getTien_con_lai(),
                hoaDonDTO.getMa_phieu_giam_gia(),
                hoaDonDTO.getDiem()
        ));
    }
    
    public void CreateHD(String []str){
        hoaDonDAL.addData(str);
        this.resetListHD();
        this.loadListHD();
    }
    public void delHD(String ma_hoa_don){
        hoaDonDAL.delData(ma_hoa_don);
        this.resetListHD();
        this.loadListHD();
    }
    public String MaMoi(){
/*s1*/  String ma = hoaDonDAL.getMaMax();
/*c1*/  if(ma != null){
/*s2*/      int size = ma.length();
/*s3*/      int ma_hien_tai = Integer.parseInt(ma.substring(2,size));
/*s4*/      int ma_moi = ma_hien_tai + 1;
            
/*c2*/      if(ma_moi < 10){
/*s5*/          return "0" + ma_moi;
            }
/*s6*/      return "" + ma_moi;
        }
/*s7*/      return "01";
    }
    public void setTableHD(DefaultTableModel model){    
/*s1*/  this.resetListHD();
/*s2*/  this.loadListHD();
/*c1*/  while(model.getRowCount() > 0){
/*s3*/      model.removeRow(0);
        }
/*s4*/  resetListExcel();
/*s5*/  ThanhVienDTO thanhVienDTO = null;String ten_tv = "";
/*c2*/  for (HoaDonDTO hoaDonDTO : listHD) {
/*s6*/      thanhVienDTO = new ThanhVienBLL().getTvByMaTV(hoaDonDTO.getMa_thanh_vien());
/*c3*/      if(thanhVienDTO != null){
/*s7*/          ten_tv = thanhVienDTO.getTen_thanh_vien();  
            }else{
/*s8*/          ten_tv = "null";
            }
/*s9*/      model.addRow(new Object[]{
                hoaDonDTO.getMa_hoa_don(),
                hoaDonDTO.getNgay_xuat(),
                hoaDonDTO.getMa_nhan_vien(),
                new NhanVienBLL().getNvByMaNV(hoaDonDTO.getMa_nhan_vien()).getTen_nhan_vien(),
                hoaDonDTO.getMa_thanh_vien(),
                ten_tv,
                hoaDonDTO.getTong_tien(),
                hoaDonDTO.getTien_giam(),
                hoaDonDTO.getTien_con_lai(),
                hoaDonDTO.getMa_phieu_giam_gia(),
                hoaDonDTO.getDiem()
            });
/*s10*/     updateListExcel(hoaDonDTO);
        }
/*s11*/ model.fireTableDataChanged();
    }
    
    public int getHoaDonCoGiaMax(){
/*s1*/  this.resetListHD();
/*s2*/  this.loadListHD();
        
/*s3*/  int max = listHD.get(0).getTien_con_lai();
/*c1*/  for(int i = 1 ; i < listHD.size() ; i++){
/*c2*/      if(listHD.get(i).getTien_con_lai() > max){
/*s4*/          max = listHD.get(i).getTien_con_lai();
            }
        }
/*s5*/  return max;
    }
    public int getHoaDonCoGiaMin(){
/*s1*/  this.resetListHD();
/*s2*/  this.loadListHD();
        
/*s3*/  int min = listHD.get(0).getTien_con_lai();
/*c1*/  for(int i = 1 ; i < listHD.size() ; i++){
/*c2*/      if(listHD.get(i).getTien_con_lai() < min){
/*s4*/          min = listHD.get(i).getTien_con_lai();
            }
        }
/*s5*/  return min;
    }
    public int getDoanhThuThangHienTai(){
/*s1*/  this.resetListHD();
/*s2*/  this.loadListHD();
        
/*s3*/  int tong = 0;
/*s4*/   String dateNow = java.time.LocalDate.now().toString();String mountNow = dateNow.split("-")[1];String YearNow = dateNow.split("-")[0];
        
/*c1*/  for (HoaDonDTO hoaDonDTO : listHD) {
/*c2*/      if(hoaDonDTO.getNgay_xuat().toString().split("-")[0].equals(YearNow)){
/*c3*/          if(hoaDonDTO.getNgay_xuat().toString().split("-")[1].equals(mountNow)){
/*s5*/              tong += hoaDonDTO.getTien_con_lai();
                }
            }
        }
/*s6*/  return tong;
    }
    public int getDoanhThuNamHienTai(){
/*s1*/  this.resetListHD();
/*s2*/  this.loadListHD();
        
/*s3*/  int tong = 0;
/*s4*/  String yearNow = java.time.LocalDate.now().toString().split("-")[0];
/*c1*/  for (HoaDonDTO hoaDonDTO : listHD) {
/*c2*/      if(hoaDonDTO.getNgay_xuat().toString().split("-")[0].equals(yearNow)){
/*s5*/          tong += hoaDonDTO.getTien_con_lai();
            }
        }
/*s6*/  return tong;
    }
    public int getDoanhThuNgayHienTai(){
        this.resetListHD();
        this.loadListHD();
        
        int tong = 0;
        
        String yearNow = java.time.LocalDate.now().toString().split("-")[0];
        String mountNow = java.time.LocalDate.now().toString().split("-")[1];
        String dayNow = java.time.LocalDate.now().toString().split("-")[2];
        
        for (HoaDonDTO hoaDonDTO : listHD) {
            if(hoaDonDTO.getNgay_xuat().toString().split("-")[0].equals(yearNow)){
                if(hoaDonDTO.getNgay_xuat().toString().split("-")[1].equals(mountNow)){
                    if(hoaDonDTO.getNgay_xuat().toString().split("-")[2].equals(dayNow)){
                        tong += hoaDonDTO.getTien_con_lai();
                    }
                }
            }
        }
        return tong;
    }

    public void thongKeHoaDonTheoDiem(DefaultTableModel modelHD, int searchHDTu, int searchHDDen) {
        this.resetListHD();
        this.loadListHD();
        
        while(modelHD.getRowCount() > 0){
            modelHD.removeRow(0);
        }
        this.resetListExcel();
        ThanhVienDTO thanhVienDTO = null;
        String ten_tv = "";

        for (HoaDonDTO hoaDonDTO : listHD) {
            thanhVienDTO = new ThanhVienBLL().getTvByMaTV(hoaDonDTO.getMa_thanh_vien());
            if(thanhVienDTO != null){
                ten_tv = thanhVienDTO.getTen_thanh_vien();
            }
            if(thanhVienDTO == null){
                ten_tv = "null";
            }
            if(hoaDonDTO.getDiem() > searchHDTu && hoaDonDTO.getDiem() < searchHDDen){
                modelHD.addRow(new Object[]{
                    hoaDonDTO.getMa_hoa_don(),
                    hoaDonDTO.getNgay_xuat(),
                    hoaDonDTO.getMa_nhan_vien(),
                    new NhanVienBLL().getNvByMaNV(hoaDonDTO.getMa_nhan_vien()).getTen_nhan_vien(),
                    hoaDonDTO.getMa_thanh_vien(),
                    ten_tv,
                    hoaDonDTO.getTong_tien(),
                    hoaDonDTO.getTien_giam(),
                    hoaDonDTO.getTien_con_lai(),
                    hoaDonDTO.getMa_phieu_giam_gia(),
                    hoaDonDTO.getDiem()
                });
                this.updateListExcel(hoaDonDTO);
            }
        }
        modelHD.fireTableDataChanged();
    }

    public void thongKeHoaDonTheoTienConLai(DefaultTableModel modelHD, int searchHDTu, int searchHDDen) {
        this.resetListHD();
        this.loadListHD();
        
        while(modelHD.getRowCount() > 0){
            modelHD.removeRow(0);
        }
        this.resetListExcel();
        ThanhVienDTO thanhVienDTO = null;
        String ten_tv = "";

        for (HoaDonDTO hoaDonDTO : listHD) {
            thanhVienDTO = new ThanhVienBLL().getTvByMaTV(hoaDonDTO.getMa_thanh_vien());
            if(thanhVienDTO != null){
                ten_tv = thanhVienDTO.getTen_thanh_vien();
            }
            if(thanhVienDTO == null){
                ten_tv = "null";
            }
            if(hoaDonDTO.getTien_con_lai() > searchHDTu && hoaDonDTO.getTien_con_lai() < searchHDDen){
                modelHD.addRow(new Object[]{
                    hoaDonDTO.getMa_hoa_don(),
                    hoaDonDTO.getNgay_xuat(),
                    hoaDonDTO.getMa_nhan_vien(),
                    new NhanVienBLL().getNvByMaNV(hoaDonDTO.getMa_nhan_vien()).getTen_nhan_vien(),
                    hoaDonDTO.getMa_thanh_vien(),
                    ten_tv,
                    hoaDonDTO.getTong_tien(),
                    hoaDonDTO.getTien_giam(),
                    hoaDonDTO.getTien_con_lai(),
                    hoaDonDTO.getMa_phieu_giam_gia(),
                    hoaDonDTO.getDiem()
                });
                this.updateListExcel(hoaDonDTO);
            }
        }
        modelHD.fireTableDataChanged();
    }

    public void thongKeHoaDonTheoTienGiam(DefaultTableModel modelHD, int searchHDTu, int searchHDDen) {
        this.resetListHD();
        this.loadListHD();
        
        while(modelHD.getRowCount() > 0){
            modelHD.removeRow(0);
        }
        this.resetListExcel();
        ThanhVienDTO thanhVienDTO = null;
        String ten_tv = "";

        for (HoaDonDTO hoaDonDTO : listHD) {
            thanhVienDTO = new ThanhVienBLL().getTvByMaTV(hoaDonDTO.getMa_thanh_vien());
            if(thanhVienDTO != null){
                ten_tv = thanhVienDTO.getTen_thanh_vien();
            }
            if(thanhVienDTO == null){
                ten_tv = "null";
            }
            if(hoaDonDTO.getTien_giam() > searchHDTu && hoaDonDTO.getTien_giam() < searchHDDen){
                modelHD.addRow(new Object[]{
                    hoaDonDTO.getMa_hoa_don(),
                    hoaDonDTO.getNgay_xuat(),
                    hoaDonDTO.getMa_nhan_vien(),
                    new NhanVienBLL().getNvByMaNV(hoaDonDTO.getMa_nhan_vien()).getTen_nhan_vien(),
                    hoaDonDTO.getMa_thanh_vien(),
                    ten_tv,
                    hoaDonDTO.getTong_tien(),
                    hoaDonDTO.getTien_giam(),
                    hoaDonDTO.getTien_con_lai(),
                    hoaDonDTO.getMa_phieu_giam_gia(),
                    hoaDonDTO.getDiem()
                });
                this.updateListExcel(hoaDonDTO);
            }
        }
        modelHD.fireTableDataChanged();
    }

    public void thongKeHoaDonTheoTongTien(DefaultTableModel modelHD, int searchHDTu, int searchHDDen) {
        this.resetListHD();
        this.loadListHD();
        
        while(modelHD.getRowCount() > 0){
            modelHD.removeRow(0);
        }
        this.resetListExcel();
        ThanhVienDTO thanhVienDTO = null;
        String ten_tv = "";

        for (HoaDonDTO hoaDonDTO : listHD) {
            thanhVienDTO = new ThanhVienBLL().getTvByMaTV(hoaDonDTO.getMa_thanh_vien());
            if(thanhVienDTO != null){
                ten_tv = thanhVienDTO.getTen_thanh_vien();
            }
            if(thanhVienDTO == null){
                ten_tv = "null";
            }
            if(hoaDonDTO.getTong_tien() > searchHDTu && hoaDonDTO.getTong_tien() < searchHDDen){
                modelHD.addRow(new Object[]{
                    hoaDonDTO.getMa_hoa_don(),
                    hoaDonDTO.getNgay_xuat(),
                    hoaDonDTO.getMa_nhan_vien(),
                    new NhanVienBLL().getNvByMaNV(hoaDonDTO.getMa_nhan_vien()).getTen_nhan_vien(),
                    hoaDonDTO.getMa_thanh_vien(),
                    ten_tv,
                    hoaDonDTO.getTong_tien(),
                    hoaDonDTO.getTien_giam(),
                    hoaDonDTO.getTien_con_lai(),
                    hoaDonDTO.getMa_phieu_giam_gia(),
                    hoaDonDTO.getDiem()
                });
                updateListExcel(hoaDonDTO);
            }
        }
        modelHD.fireTableDataChanged();
    }

    public void timKiemHoaDonTheoMaPGG(DefaultTableModel modelHD, String search) {
        this.resetListHD();
        this.loadListHD();
        
        while(modelHD.getRowCount() > 0){
            modelHD.removeRow(0);
        }
        resetListExcel();
        ThanhVienDTO thanhVienDTO = null;
        String ten_tv = "";
        
        for (HoaDonDTO hoaDonDTO : listHD) {
            thanhVienDTO = new ThanhVienBLL().getTvByMaTV(hoaDonDTO.getMa_thanh_vien());
            if(thanhVienDTO != null){
                ten_tv = thanhVienDTO.getTen_thanh_vien();
            }
            if(thanhVienDTO == null){
                ten_tv = "null";
            }
            if(hoaDonDTO.getMa_phieu_giam_gia().contains(search)){
                modelHD.addRow(new Object[]{
                    hoaDonDTO.getMa_hoa_don(),
                    hoaDonDTO.getNgay_xuat(),
                    hoaDonDTO.getMa_nhan_vien(),
                    new NhanVienBLL().getNvByMaNV(hoaDonDTO.getMa_nhan_vien()).getTen_nhan_vien(),
                    hoaDonDTO.getMa_thanh_vien(),
                    ten_tv,
                    hoaDonDTO.getTong_tien(),
                    hoaDonDTO.getTien_giam(),
                    hoaDonDTO.getTien_con_lai(),
                    hoaDonDTO.getMa_phieu_giam_gia(),
                    hoaDonDTO.getDiem()
                });
                updateListExcel(hoaDonDTO);
            }
        }
        modelHD.fireTableDataChanged();
    }

    public void timKiemHoaDonTheoTenTV(DefaultTableModel modelHD, String search) {
        this.resetListHD();
        this.loadListHD();
        
        while(modelHD.getRowCount() > 0){
            modelHD.removeRow(0);
        }
        resetListExcel();
        ThanhVienDTO thanhVienDTO = null;
        String ten_tv = "";
        
        for (HoaDonDTO hoaDonDTO : listHD) {
            thanhVienDTO = new ThanhVienBLL().getTvByMaTV(hoaDonDTO.getMa_thanh_vien());
            if(thanhVienDTO != null){
                ten_tv = thanhVienDTO.getTen_thanh_vien();
            }
            if(thanhVienDTO == null){
                ten_tv = "null";
            }
            if(ten_tv.contains(search)){
                modelHD.addRow(new Object[]{
                    hoaDonDTO.getMa_hoa_don(),
                    hoaDonDTO.getNgay_xuat(),
                    hoaDonDTO.getMa_nhan_vien(),
                    new NhanVienBLL().getNvByMaNV(hoaDonDTO.getMa_nhan_vien()).getTen_nhan_vien(),
                    hoaDonDTO.getMa_thanh_vien(),
                    ten_tv,
                    hoaDonDTO.getTong_tien(),
                    hoaDonDTO.getTien_giam(),
                    hoaDonDTO.getTien_con_lai(),
                    hoaDonDTO.getMa_phieu_giam_gia(),
                    hoaDonDTO.getDiem()
                });
                updateListExcel(hoaDonDTO);
            }
        }
        modelHD.fireTableDataChanged();
    }

    public void timKiemHoaDonTheoMaTV(DefaultTableModel modelHD, String search) {
        this.resetListHD();
        this.loadListHD();
        
        while(modelHD.getRowCount() > 0){
            modelHD.removeRow(0);
        }
        resetListExcel();
        ThanhVienDTO thanhVienDTO = null;
        String ten_tv = "";
        
        for (HoaDonDTO hoaDonDTO : listHD) {
            thanhVienDTO = new ThanhVienBLL().getTvByMaTV(hoaDonDTO.getMa_thanh_vien());
            if(thanhVienDTO != null){
                ten_tv = thanhVienDTO.getTen_thanh_vien();
            }
            if(thanhVienDTO == null){
                ten_tv = "null";
            }
            if(hoaDonDTO.getMa_thanh_vien().contains(search)){
                modelHD.addRow(new Object[]{
                    hoaDonDTO.getMa_hoa_don(),
                    hoaDonDTO.getNgay_xuat(),
                    hoaDonDTO.getMa_nhan_vien(),
                    new NhanVienBLL().getNvByMaNV(hoaDonDTO.getMa_nhan_vien()).getTen_nhan_vien(),
                    hoaDonDTO.getMa_thanh_vien(),
                    ten_tv,
                    hoaDonDTO.getTong_tien(),
                    hoaDonDTO.getTien_giam(),
                    hoaDonDTO.getTien_con_lai(),
                    hoaDonDTO.getMa_phieu_giam_gia(),
                    hoaDonDTO.getDiem()
                });
                updateListExcel(hoaDonDTO);
            }
        }
        modelHD.fireTableDataChanged();
    }

    public void timKiemHoaDonTheoTenNV(DefaultTableModel modelHD, String search) {
        this.resetListHD();
        this.loadListHD();
        
        while(modelHD.getRowCount() > 0){
            modelHD.removeRow(0);
        }
        resetListExcel();
        ThanhVienDTO thanhVienDTO = null;
        NhanVienDTO nhanVienDTO = null;
        String ten_tv = "";
        
        for (HoaDonDTO hoaDonDTO : listHD) {
            thanhVienDTO = new ThanhVienBLL().getTvByMaTV(hoaDonDTO.getMa_thanh_vien());
            if(thanhVienDTO != null){
                ten_tv = thanhVienDTO.getTen_thanh_vien();
            }
            if(thanhVienDTO == null){
                ten_tv = "null";
            }
            
            nhanVienDTO = new NhanVienBLL().getNvByMaNV(hoaDonDTO.getMa_nhan_vien());
            String ten_nv = nhanVienDTO.getTen_nhan_vien();
            
            if(ten_nv.contains(search)){
                modelHD.addRow(new Object[]{
                    hoaDonDTO.getMa_hoa_don(),
                    hoaDonDTO.getNgay_xuat(),
                    hoaDonDTO.getMa_nhan_vien(),
                    ten_nv,
                    hoaDonDTO.getMa_thanh_vien(),
                    ten_tv,
                    hoaDonDTO.getTong_tien(),
                    hoaDonDTO.getTien_giam(),
                    hoaDonDTO.getTien_con_lai(),
                    hoaDonDTO.getMa_phieu_giam_gia(),
                    hoaDonDTO.getDiem()
                });
                updateListExcel(hoaDonDTO);
            }
        }
        modelHD.fireTableDataChanged();
    }

    public void timKiemHoaDonTheoMaNV(DefaultTableModel modelHD, String search) {
        this.resetListHD();
        this.loadListHD();
        
        while(modelHD.getRowCount() > 0){
            modelHD.removeRow(0);
        }
        resetListExcel();
        ThanhVienDTO thanhVienDTO = null;
        String ten_tv = "";
        
        for (HoaDonDTO hoaDonDTO : listHD) {
            thanhVienDTO = new ThanhVienBLL().getTvByMaTV(hoaDonDTO.getMa_thanh_vien());
            if(thanhVienDTO != null){
                ten_tv = thanhVienDTO.getTen_thanh_vien();
            }
            if(thanhVienDTO == null){
                ten_tv = "null";
            }
            if(hoaDonDTO.getMa_nhan_vien().contains(search)){
                modelHD.addRow(new Object[]{
                    hoaDonDTO.getMa_hoa_don(),
                    hoaDonDTO.getNgay_xuat(),
                    hoaDonDTO.getMa_nhan_vien(),
                    new NhanVienBLL().getNvByMaNV(hoaDonDTO.getMa_nhan_vien()).getTen_nhan_vien(),
                    hoaDonDTO.getMa_thanh_vien(),
                    ten_tv,
                    hoaDonDTO.getTong_tien(),
                    hoaDonDTO.getTien_giam(),
                    hoaDonDTO.getTien_con_lai(),
                    hoaDonDTO.getMa_phieu_giam_gia(),
                    hoaDonDTO.getDiem()
                });
                updateListExcel(hoaDonDTO);
            }
        }
        modelHD.fireTableDataChanged();
    }

    public void timKiemHoaDonTheoNgay(DefaultTableModel modelHD, String search) {
        this.resetListHD();
        this.loadListHD();
        
        while(modelHD.getRowCount() > 0){
            modelHD.removeRow(0);
        }
        resetListExcel();
        ThanhVienDTO thanhVienDTO = null;
        String ten_tv = "";
        
        for (HoaDonDTO hoaDonDTO : listHD) {
            thanhVienDTO = new ThanhVienBLL().getTvByMaTV(hoaDonDTO.getMa_thanh_vien());
            if(thanhVienDTO != null){
                ten_tv = thanhVienDTO.getTen_thanh_vien();
            }
            if(thanhVienDTO == null){
                ten_tv = "null";
            }
            if(hoaDonDTO.getNgay_xuat().toString().contains(search)){
                modelHD.addRow(new Object[]{
                    hoaDonDTO.getMa_hoa_don(),
                    hoaDonDTO.getNgay_xuat(),
                    hoaDonDTO.getMa_nhan_vien(),
                    new NhanVienBLL().getNvByMaNV(hoaDonDTO.getMa_nhan_vien()).getTen_nhan_vien(),
                    hoaDonDTO.getMa_thanh_vien(),
                    ten_tv,
                    hoaDonDTO.getTong_tien(),
                    hoaDonDTO.getTien_giam(),
                    hoaDonDTO.getTien_con_lai(),
                    hoaDonDTO.getMa_phieu_giam_gia(),
                    hoaDonDTO.getDiem()
                });
                updateListExcel(hoaDonDTO);
            }
        }
        modelHD.fireTableDataChanged();        
    }

    public void timKiemHoaDonTheoMaHD(DefaultTableModel modelHD, String search) {
        this.resetListHD();
        this.loadListHD();
        
        while(modelHD.getRowCount() > 0){
            modelHD.removeRow(0);
        }
        
        ThanhVienDTO thanhVienDTO = null;
        String ten_tv = "";
        resetListExcel();
        for (HoaDonDTO hoaDonDTO : listHD) {
            thanhVienDTO = new ThanhVienBLL().getTvByMaTV(hoaDonDTO.getMa_thanh_vien());
            if(thanhVienDTO != null){
                ten_tv = thanhVienDTO.getTen_thanh_vien();
            }
            if(thanhVienDTO == null){
                ten_tv = "null";
            }
            if(hoaDonDTO.getMa_hoa_don().contains(search)){
                modelHD.addRow(new Object[]{
                    hoaDonDTO.getMa_hoa_don(),
                    hoaDonDTO.getNgay_xuat(),
                    hoaDonDTO.getMa_nhan_vien(),
                    new NhanVienBLL().getNvByMaNV(hoaDonDTO.getMa_nhan_vien()).getTen_nhan_vien(),
                    hoaDonDTO.getMa_thanh_vien(),
                    ten_tv,
                    hoaDonDTO.getTong_tien(),
                    hoaDonDTO.getTien_giam(),
                    hoaDonDTO.getTien_con_lai(),
                    hoaDonDTO.getMa_phieu_giam_gia(),
                    hoaDonDTO.getDiem()
                });
                updateListExcel(hoaDonDTO);
            }
        }
        modelHD.fireTableDataChanged();
    }

    public void timKiemHoaDonTheoKhoanTG(DefaultTableModel modelHD, java.util.Date dateFrom, java.util.Date dateTo) {
        this.resetListHD();
        this.loadListHD();
        
        while(modelHD.getRowCount() > 0){
            modelHD.removeRow(0);
        }
        
        ThanhVienDTO thanhVienDTO = null;
        String ten_tv = "";
        resetListExcel();
        for (HoaDonDTO hoaDonDTO : listHD) {
            thanhVienDTO = new ThanhVienBLL().getTvByMaTV(hoaDonDTO.getMa_thanh_vien());
            if(thanhVienDTO != null){
                ten_tv = thanhVienDTO.getTen_thanh_vien();
            }
            if(thanhVienDTO == null){
                ten_tv = "null";
            }
            if(hoaDonDTO.getNgay_xuat().after(dateFrom) && hoaDonDTO.getNgay_xuat().before(dateTo)){
                modelHD.addRow(new Object[]{
                    hoaDonDTO.getMa_hoa_don(),
                    hoaDonDTO.getNgay_xuat(),
                    hoaDonDTO.getMa_nhan_vien(),
                    new NhanVienBLL().getNvByMaNV(hoaDonDTO.getMa_nhan_vien()).getTen_nhan_vien(),
                    hoaDonDTO.getMa_thanh_vien(),
                    ten_tv,
                    hoaDonDTO.getTong_tien(),
                    hoaDonDTO.getTien_giam(),
                    hoaDonDTO.getTien_con_lai(),
                    hoaDonDTO.getMa_phieu_giam_gia(),
                    hoaDonDTO.getDiem()
                });
                updateListExcel(hoaDonDTO);
            }
        }
        modelHD.fireTableDataChanged();
    }
}
