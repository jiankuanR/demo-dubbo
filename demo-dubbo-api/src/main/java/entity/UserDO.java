package entity;

import java.io.Serializable;

/**
 * @author YCKJ0769
 * @类名称：UserDO
 * @类描述：TODO
 * @日期：2018年6月17日
 * @版本：V1.0
 */
public class UserDO implements Serializable {

    private static final long serialVersionUID = 5438739092677089251L;

    private Long id;

    private String name;

    private String passwrod;

    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getPasswrod() {
        return passwrod;
    }
    public void setPasswrod(String passwrod) {
        this.passwrod = passwrod;
    }
    public UserDO() {
        super();
    }
    public UserDO(Long id, String name, String passwrod) {
        super();
        this.id = id;
        this.name = name;
        this.passwrod = passwrod;
    }

    @Override
    public String toString() {
        return "UserDO{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", passwrod='" + passwrod + '\'' +
                '}';
    }
}