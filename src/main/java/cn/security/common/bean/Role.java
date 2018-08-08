package cn.security.common.bean;

/**
 * Created by viruser on 2018/8/8.
 */
public class Role {
    private int id;
    private String name;
    private String chineseName;

    public Role() {
    }

    public Role(int id, String name, String chineseName) {
        this.id = id;
        this.name = name;
        this.chineseName = chineseName;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getChineseName() {
        return chineseName;
    }

    public void setChineseName(String chineseName) {
        this.chineseName = chineseName;
    }
}
