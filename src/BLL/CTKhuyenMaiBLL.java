/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BLL;
 
import DAL.ChuongTrinhKMDAL;
import DTO.ChuongTrinhKMDTO;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author niek
 */
public class CTKhuyenMaiBLL {
    public static List<ChuongTrinhKMDTO> listKM = new ArrayList<>();
    ChuongTrinhKMDAL chuongTrinhKMDAL = new ChuongTrinhKMDAL();
    
    public CTKhuyenMaiBLL(){
    }
    
    public void resetListKM(){
        while(listKM.size()>0){
            listKM.remove(0);
        }
    }
    public void loadListKM(){
        listKM = chuongTrinhKMDAL.getData();
    }
    public void setListTableKM(DefaultTableModel model){
/*s1*/  this.resetListKM();
/*s2*/  this.loadListKM();
        
/*c1*/  while(model.getRowCount() > 0){
/*s3*/      model.removeRow(0);
        }
/*c2*/  if(listKM.size() > 0){

/*c3*/  for (ChuongTrinhKMDTO chuongTrinhKMDTO : listKM) {
/*s4*/      model.addRow(new Object[]{
                chuongTrinhKMDTO.getMa_ctkm(),
                chuongTrinhKMDTO.getTen_ctkm(),
                chuongTrinhKMDTO.getNgay_bat_dau(),
                chuongTrinhKMDTO.getNgay_ket_thuc(),
                chuongTrinhKMDTO.getTrang_thai()
            });
        }
        }
/*s5*/  model.fireTableDataChanged();
    }
    public void doiTrangThai(int ma_ctkm,String tt){
/*s1*/  chuongTrinhKMDAL.updateStatus(ma_ctkm,tt);
/*s2*/  this.resetListKM();
/*s3*/  this.loadListKM();
    }
    public void themCTKM(String []str){
/*s1*/  chuongTrinhKMDAL.addData(str);
/*s2*/  this.resetListKM();
/*s3*/  this.loadListKM();
    }
    public void suaCTKM(String arr[]){
/*s1*/  chuongTrinhKMDAL.updateData(arr);
/*s2*/  this.resetListKM();
/*s3*/  this.loadListKM();
    }
    public  void xoaCTKM(int ma_ctkm){
/*s1*/  chuongTrinhKMDAL.delData(ma_ctkm);
/*s2*/  this.resetListKM();
/*s3*/  this.loadListKM();
    }
    public int maMoi(){
/*s1*/  int maHienTai = chuongTrinhKMDAL.getMaMax();
       
/*c1*/  if(maHienTai!=-1){
/*s2*/      int maMoi = maHienTai + 1;
/*s3*/      return maMoi;
        }
/*s4*/  return 1;
    }
    public ChuongTrinhKMDTO getCtkmByMaCTKM(int ma_ctkm){
/*s1*/  this.resetListKM();
/*s2*/  this.loadListKM();
        
/*c1*/  for (ChuongTrinhKMDTO chuongTrinhKMDTO : listKM) {
/*c2*/      if(chuongTrinhKMDTO.getMa_ctkm() == ma_ctkm){
/*s3*/          return chuongTrinhKMDTO;
            }
        }
/*s4*/  return null;
    }
    public boolean checkKm(){
/*s1*/  this.resetListKM();
/*s2*/  this.loadListKM();
        
/*s3*/  boolean flag = false;
/*c1*/  for (ChuongTrinhKMDTO chuongTrinhKMDTO : listKM) {
/*c2*/      if(chuongTrinhKMDTO.getTrang_thai() == 1){
/*s4*/          flag = true;
            }
        }
/*s5*/  return flag;
    }

    public void timKiemCtkmTheoMa(DefaultTableModel modelCTKM, String search) {
/*s1*/  this.resetListKM();
/*s2*/  this.loadListKM();
        
/*c1*/  while(modelCTKM.getRowCount() > 0){
/*s3*/      modelCTKM.removeRow(0);
        }
/*c2*/  for (ChuongTrinhKMDTO chuongTrinhKMDTO : listKM) {
/*c3*/      if(String.valueOf(chuongTrinhKMDTO.getMa_ctkm()).contains(search)){
/*s4*/          modelCTKM.addRow(new Object[]{
                    chuongTrinhKMDTO.getMa_ctkm(),
                    chuongTrinhKMDTO.getTen_ctkm(),
                    chuongTrinhKMDTO.getNgay_bat_dau(),
                    chuongTrinhKMDTO.getNgay_ket_thuc(),
                    chuongTrinhKMDTO.getTrang_thai()
                });
            }
        }
/*s5*/  modelCTKM.fireTableDataChanged();
    }

    public void timKiemCtkmTheoTen(DefaultTableModel modelCTKM, String search) {
/*s1*/  this.resetListKM();
/*s2*/  this.loadListKM();
        
/*c1*/  while(modelCTKM.getRowCount() > 0){
/*s3*/      modelCTKM.removeRow(0);
        }
/*c2*/  for (ChuongTrinhKMDTO chuongTrinhKMDTO : listKM) {
/*c3*/      if(chuongTrinhKMDTO.getTen_ctkm().contains(search)){
/*s4*/          modelCTKM.addRow(new Object[]{
                    chuongTrinhKMDTO.getMa_ctkm(),
                    chuongTrinhKMDTO.getTen_ctkm(),
                    chuongTrinhKMDTO.getNgay_bat_dau(),
                    chuongTrinhKMDTO.getNgay_ket_thuc(),
                    chuongTrinhKMDTO.getTrang_thai()
                });
            }
        }
/*s5*/  modelCTKM.fireTableDataChanged();
    }
    public void timKiemCtkmTheoTT(DefaultTableModel modelCTKM, String search) {
/*s1*/  this.resetListKM();
/*s2*/  this.loadListKM();
        
/*c1*/  while(modelCTKM.getRowCount() > 0){
/*s3*/            modelCTKM.removeRow(0);
        }
/*c2*/  for (ChuongTrinhKMDTO chuongTrinhKMDTO : listKM) {
/*c3*/      if(String.valueOf(chuongTrinhKMDTO.getTrang_thai()).equals(search)){
/*s4*/          modelCTKM.addRow(new Object[]{
                    chuongTrinhKMDTO.getMa_ctkm(),
                    chuongTrinhKMDTO.getTen_ctkm(),
                    chuongTrinhKMDTO.getNgay_bat_dau(),
                    chuongTrinhKMDTO.getNgay_ket_thuc(),
                    chuongTrinhKMDTO.getTrang_thai()
                });
            }
        }
/*s5*/  modelCTKM.fireTableDataChanged();
    }       

    public void timKiemCtkmTheoNgay(DefaultTableModel modelCTKM, String search) throws ParseException {
/*s1*/  Date ngay =  new SimpleDateFormat("yyyy/MM/dd").parse(search); 
/*s2*/  this.resetListKM();this.loadListKM();
        
/*c1*/  while(modelCTKM.getRowCount() > 0){
/*s3*/      modelCTKM.removeRow(0);
        }
/*c2*/  for (ChuongTrinhKMDTO chuongTrinhKMDTO : listKM) {
/*c3*/      if(chuongTrinhKMDTO.getNgay_bat_dau().before(ngay) && chuongTrinhKMDTO.getNgay_ket_thuc().after(ngay)){
/*s4*/          modelCTKM.addRow(new Object[]{
                    chuongTrinhKMDTO.getMa_ctkm(),
                    chuongTrinhKMDTO.getTen_ctkm(),
                    chuongTrinhKMDTO.getNgay_bat_dau().toString(),
                    chuongTrinhKMDTO.getNgay_ket_thuc().toString(),
                    chuongTrinhKMDTO.getTrang_thai()
                });
            }
        }
/*s5*/  modelCTKM.fireTableDataChanged();
    }

    public void timKiemKMTheoKhoanNgay(DefaultTableModel model, Date ngayTu, Date ngayDen) {
/*s1*/  this.loadListKM();
/*s2*/  this.resetListKM();
        
/*c1*/  while(model.getRowCount() > 0){
/*s3*/      model.removeRow(0);
        }
/*c2*/  for (ChuongTrinhKMDTO chuongTrinhKMDTO : listKM) {
/*c3*/      if( (ngayTu.before(chuongTrinhKMDTO.getNgay_bat_dau()) || ngayTu.before(chuongTrinhKMDTO.getNgay_ket_thuc())) && (ngayDen.after(chuongTrinhKMDTO.getNgay_ket_thuc()) || ngayDen.after(chuongTrinhKMDTO.getNgay_bat_dau())) && ngayTu.before(ngayDen)){
/*s4*/          model.addRow(new Object[]{
                    chuongTrinhKMDTO.getMa_ctkm(),
                    chuongTrinhKMDTO.getTen_ctkm(),
                    chuongTrinhKMDTO.getNgay_bat_dau(),
                    chuongTrinhKMDTO.getNgay_ket_thuc(),
                    chuongTrinhKMDTO.getTrang_thai()
                });
            }
        }
/*s5*/  model.fireTableDataChanged();
    }

    public int getTongCTKM() {
/*s1*/  this.resetListKM();
/*s2*/  this.loadListKM();
        
/*s3*/  int size = listKM.size();
/*s4*/  return size;
    }
}