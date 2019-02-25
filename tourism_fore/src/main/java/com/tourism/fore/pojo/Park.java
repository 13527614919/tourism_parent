package com.tourism.fore.pojo;

public class Park {
    private String parkId;              //景区编号
    private String parkChineseName;     //景区中文名字
    private String parkEnglishName;     //景区英文名字
    private int parkType;            //景区类型
    private String parkBuildDate;       //景区建立时间
    private String parkPopularity;      //景区人气值
    private String parkPrice;           //景区门票
    private int parkLevel;           //景区景点级别
    private String parkLng;             //景区经度
    private String parkLat;             //景区纬度
    private String parkAddress;         //景区详细地址
    private String parkPlayTime;        //景区游玩时间
    private String parkOpenTime;        //景区每日开放时间
    private String parkArea;            //景区面积
    private String parkVideo;           //景区简介视频地址
    private String parkPhone;           //景区联系热线
    private String parkIntro;           //景区简介
    private String parkImg;             //景区图片地址
    private String parkWord;            //景区推荐标签
    private String parkEncode;          //景区位置字符编码

    /**
     * 新增字段两点距离值 dist
     * @return
     */
    private int dist;

    public int getDist() {
        return dist;
    }

    public void setDist(int dist) {
        this.dist = dist;
    }

    public String getParkId() {
        return parkId;
    }

    public void setParkId(String parkId) {
        this.parkId = parkId;
    }

    public String getParkChineseName() {
        return parkChineseName;
    }

    public void setParkChineseName(String parkChineseName) {
        this.parkChineseName = parkChineseName;
    }

    public String getParkEnglishName() {
        return parkEnglishName;
    }

    public void setParkEnglishName(String parkEnglishName) {
        this.parkEnglishName = parkEnglishName;
    }

    public int getParkType() {
        return parkType;
    }

    public void setParkType(int parkType) {
        this.parkType = parkType;
    }

    public String getParkBuildDate() {
        return parkBuildDate;
    }

    public void setParkBuildDate(String parkBuildDate) {
        this.parkBuildDate = parkBuildDate;
    }

    public String getParkPopularity() {
        return parkPopularity;
    }

    public void setParkPopularity(String parkPopularity) {
        this.parkPopularity = parkPopularity;
    }

    public String getParkPrice() {
        return parkPrice;
    }

    public void setParkPrice(String parkPrice) {
        this.parkPrice = parkPrice;
    }

    public int getParkLevel() {
        return parkLevel;
    }

    public void setParkLevel(int parkLevel) {
        this.parkLevel = parkLevel;
    }

    public String getParkLng() {
        return parkLng;
    }

    public void setParkLng(String parkLng) {
        this.parkLng = parkLng;
    }

    public String getParkLat() {
        return parkLat;
    }

    public void setParkLat(String parkLat) {
        this.parkLat = parkLat;
    }

    public String getParkAddress() {
        return parkAddress;
    }

    public void setParkAddress(String parkAddress) {
        this.parkAddress = parkAddress;
    }

    public String getParkPlayTime() {
        return parkPlayTime;
    }

    public void setParkPlayTime(String parkPlayTime) {
        this.parkPlayTime = parkPlayTime;
    }

    public String getParkOpenTime() {
        return parkOpenTime;
    }

    public void setParkOpenTime(String parkOpenTime) {
        this.parkOpenTime = parkOpenTime;
    }

    public String getParkArea() {
        return parkArea;
    }

    public void setParkArea(String parkArea) {
        this.parkArea = parkArea;
    }

    public String getParkVideo() {
        return parkVideo;
    }

    public void setParkVideo(String parkVideo) {
        this.parkVideo = parkVideo;
    }

    public String getParkPhone() {
        return parkPhone;
    }

    public void setParkPhone(String parkPhone) {
        this.parkPhone = parkPhone;
    }

    public String getParkIntro() {
        return parkIntro;
    }

    public void setParkIntro(String parkIntro) {
        this.parkIntro = parkIntro;
    }

    public String getParkImg() {
        return parkImg;
    }

    public void setParkImg(String parkImg) {
        this.parkImg = parkImg;
    }

    public String getParkWord() {
        return parkWord;
    }

    public void setParkWord(String parkWord) {
        this.parkWord = parkWord;
    }

    public String getParkEncode() {
        return parkEncode;
    }

    public void setParkEncode(String parkEncode) {
        this.parkEncode = parkEncode;
    }
}
