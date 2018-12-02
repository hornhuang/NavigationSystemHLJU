package com.example.a30797.navigationsystemhlju.attractions;


public class Scenic {

    private int imageId;

    private String name;

    private String introduce;

    /**
     * 构造方法
     *
     * @param imageId
     * @param introduce
     */

    public Scenic(int imageId, String name, String introduce) {
        this.imageId = imageId;
        this.name = name;
        this.introduce = introduce;
    }

    public Scenic(int imageId, String introduce) {
        this.imageId = imageId;
        this.introduce = introduce;
    }

    public Scenic(int imageId) {
        this.imageId = imageId;
    }

    public Scenic(String introduce) {
        this.introduce = introduce;
    }

    public Scenic() {
    }

    /**
     * 访问数据成员的方法
     *
     * @return
     */
    public int getImageId() {
        return imageId;
    }

    public void setImageId(int imageId) {
        this.imageId = imageId;
    }

    public String getIntroduce() {
        return introduce;
    }

    public void setIntroduce(String introduce) {
        this.introduce = introduce;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}


