package com.example.demo.model;

import java.util.Date;

public class User {
    private Integer id;

    private String nationalCode;

    private String username;

    private String realname;

    private String nickname;

    private String email;

    private String mobile;

    private String password;

    private String passSalt;

    private Integer type;

    private Integer status;

    private Integer workstageId;

    private Date createAt;

    private Integer createBy;

    private Date updateAt;

    private Integer updateBy;

    private String headImage;

    private Integer sex;

    private Date birthday;

    private Integer bloodtype;

    private String nationality;

    private Integer language;

    private Integer idcardType;

    private String idcard;

    private Integer registerLocal;

    private String cardNumber;

    private Integer enterType;

    private String creator;

    private String uuid;

    private Integer constellation;

    private String backgroundImg;

    private Integer complete;

    private Integer isInvestor;

    private String manager;

    private Date memberDeadline;

    private Integer merchantStatus;

    private Integer rfMemberId;

    private String summary;

    private Integer flag;

    private String faceImg;

    private Integer updateLeaseUser;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNationalCode() {
        return nationalCode;
    }

    public void setNationalCode(String nationalCode) {
        this.nationalCode = nationalCode == null ? null : nationalCode.trim();
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username == null ? null : username.trim();
    }

    public String getRealname() {
        return realname;
    }

    public void setRealname(String realname) {
        this.realname = realname == null ? null : realname.trim();
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname == null ? null : nickname.trim();
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email == null ? null : email.trim();
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile == null ? null : mobile.trim();
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    public String getPassSalt() {
        return passSalt;
    }

    public void setPassSalt(String passSalt) {
        this.passSalt = passSalt == null ? null : passSalt.trim();
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Integer getWorkstageId() {
        return workstageId;
    }

    public void setWorkstageId(Integer workstageId) {
        this.workstageId = workstageId;
    }

    public Date getCreateAt() {
        return createAt;
    }

    public void setCreateAt(Date createAt) {
        this.createAt = createAt;
    }

    public Integer getCreateBy() {
        return createBy;
    }

    public void setCreateBy(Integer createBy) {
        this.createBy = createBy;
    }

    public Date getUpdateAt() {
        return updateAt;
    }

    public void setUpdateAt(Date updateAt) {
        this.updateAt = updateAt;
    }

    public Integer getUpdateBy() {
        return updateBy;
    }

    public void setUpdateBy(Integer updateBy) {
        this.updateBy = updateBy;
    }

    public String getHeadImage() {
        return headImage;
    }

    public void setHeadImage(String headImage) {
        this.headImage = headImage == null ? null : headImage.trim();
    }

    public Integer getSex() {
        return sex;
    }

    public void setSex(Integer sex) {
        this.sex = sex;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public Integer getBloodtype() {
        return bloodtype;
    }

    public void setBloodtype(Integer bloodtype) {
        this.bloodtype = bloodtype;
    }

    public String getNationality() {
        return nationality;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality == null ? null : nationality.trim();
    }

    public Integer getLanguage() {
        return language;
    }

    public void setLanguage(Integer language) {
        this.language = language;
    }

    public Integer getIdcardType() {
        return idcardType;
    }

    public void setIdcardType(Integer idcardType) {
        this.idcardType = idcardType;
    }

    public String getIdcard() {
        return idcard;
    }

    public void setIdcard(String idcard) {
        this.idcard = idcard == null ? null : idcard.trim();
    }

    public Integer getRegisterLocal() {
        return registerLocal;
    }

    public void setRegisterLocal(Integer registerLocal) {
        this.registerLocal = registerLocal;
    }

    public String getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(String cardNumber) {
        this.cardNumber = cardNumber == null ? null : cardNumber.trim();
    }

    public Integer getEnterType() {
        return enterType;
    }

    public void setEnterType(Integer enterType) {
        this.enterType = enterType;
    }

    public String getCreator() {
        return creator;
    }

    public void setCreator(String creator) {
        this.creator = creator == null ? null : creator.trim();
    }

    public String getUuid() {
        return uuid;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid == null ? null : uuid.trim();
    }

    public Integer getConstellation() {
        return constellation;
    }

    public void setConstellation(Integer constellation) {
        this.constellation = constellation;
    }

    public String getBackgroundImg() {
        return backgroundImg;
    }

    public void setBackgroundImg(String backgroundImg) {
        this.backgroundImg = backgroundImg == null ? null : backgroundImg.trim();
    }

    public Integer getComplete() {
        return complete;
    }

    public void setComplete(Integer complete) {
        this.complete = complete;
    }

    public Integer getIsInvestor() {
        return isInvestor;
    }

    public void setIsInvestor(Integer isInvestor) {
        this.isInvestor = isInvestor;
    }

    public String getManager() {
        return manager;
    }

    public void setManager(String manager) {
        this.manager = manager == null ? null : manager.trim();
    }

    public Date getMemberDeadline() {
        return memberDeadline;
    }

    public void setMemberDeadline(Date memberDeadline) {
        this.memberDeadline = memberDeadline;
    }

    public Integer getMerchantStatus() {
        return merchantStatus;
    }

    public void setMerchantStatus(Integer merchantStatus) {
        this.merchantStatus = merchantStatus;
    }

    public Integer getRfMemberId() {
        return rfMemberId;
    }

    public void setRfMemberId(Integer rfMemberId) {
        this.rfMemberId = rfMemberId;
    }

    public String getSummary() {
        return summary;
    }

    public void setSummary(String summary) {
        this.summary = summary == null ? null : summary.trim();
    }

    public Integer getFlag() {
        return flag;
    }

    public void setFlag(Integer flag) {
        this.flag = flag;
    }

    public String getFaceImg() {
        return faceImg;
    }

    public void setFaceImg(String faceImg) {
        this.faceImg = faceImg == null ? null : faceImg.trim();
    }

    public Integer getUpdateLeaseUser() {
        return updateLeaseUser;
    }

    public void setUpdateLeaseUser(Integer updateLeaseUser) {
        this.updateLeaseUser = updateLeaseUser;
    }
}