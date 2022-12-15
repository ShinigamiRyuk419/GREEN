/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.supplies to edit this template
 */
package supplies;

import org.bson.types.ObjectId;

/**
 *
 * @author Student.admin
 */
public class supplies {
    ObjectId id;
    public String nam;
    public String ty;
    public String quan;
    public String desc;
    public String address;
    public byte[] img;

    public supplies() {
    }
    
    public ObjectId getId() {
        return id;
    }

    

    public void setId(ObjectId id) {
        this.id = id;
    }

    public String getNam() {
        return nam;
    }

    public void setNam(String nam) {
        this.nam = nam;
    }

    public String getTy() {
        return ty;
    }

    public void setTy(String ty) {
        this.ty = ty;
    }

    public String getQuan() {
        return quan;
    }

    public void setQuan(String quan) {
        this.quan = quan;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public byte[] getImg() {
        return img;
    }

    public void setImg(byte[] img) {
        this.img = img;
    }

    public supplies( byte[] img, String address, String desc, String quan, String ty, String nam, ObjectId id) {
        this.img = img;
        this.address = address;
        this.desc = desc;
        this.quan = quan;
        this.ty = ty;
        this.nam = nam;
        this.id = id;
    }

    


    

    
}
