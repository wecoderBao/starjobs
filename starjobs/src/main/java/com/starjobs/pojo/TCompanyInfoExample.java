package com.starjobs.pojo;

import java.util.ArrayList;
import java.util.List;

public class TCompanyInfoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TCompanyInfoExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andCComIdIsNull() {
            addCriterion("c_com_id is null");
            return (Criteria) this;
        }

        public Criteria andCComIdIsNotNull() {
            addCriterion("c_com_id is not null");
            return (Criteria) this;
        }

        public Criteria andCComIdEqualTo(Integer value) {
            addCriterion("c_com_id =", value, "cComId");
            return (Criteria) this;
        }

        public Criteria andCComIdNotEqualTo(Integer value) {
            addCriterion("c_com_id <>", value, "cComId");
            return (Criteria) this;
        }

        public Criteria andCComIdGreaterThan(Integer value) {
            addCriterion("c_com_id >", value, "cComId");
            return (Criteria) this;
        }

        public Criteria andCComIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("c_com_id >=", value, "cComId");
            return (Criteria) this;
        }

        public Criteria andCComIdLessThan(Integer value) {
            addCriterion("c_com_id <", value, "cComId");
            return (Criteria) this;
        }

        public Criteria andCComIdLessThanOrEqualTo(Integer value) {
            addCriterion("c_com_id <=", value, "cComId");
            return (Criteria) this;
        }

        public Criteria andCComIdIn(List<Integer> values) {
            addCriterion("c_com_id in", values, "cComId");
            return (Criteria) this;
        }

        public Criteria andCComIdNotIn(List<Integer> values) {
            addCriterion("c_com_id not in", values, "cComId");
            return (Criteria) this;
        }

        public Criteria andCComIdBetween(Integer value1, Integer value2) {
            addCriterion("c_com_id between", value1, value2, "cComId");
            return (Criteria) this;
        }

        public Criteria andCComIdNotBetween(Integer value1, Integer value2) {
            addCriterion("c_com_id not between", value1, value2, "cComId");
            return (Criteria) this;
        }

        public Criteria andCComPhoneIsNull() {
            addCriterion("c_com_phone is null");
            return (Criteria) this;
        }

        public Criteria andCComPhoneIsNotNull() {
            addCriterion("c_com_phone is not null");
            return (Criteria) this;
        }

        public Criteria andCComPhoneEqualTo(String value) {
            addCriterion("c_com_phone =", value, "cComPhone");
            return (Criteria) this;
        }

        public Criteria andCComPhoneNotEqualTo(String value) {
            addCriterion("c_com_phone <>", value, "cComPhone");
            return (Criteria) this;
        }

        public Criteria andCComPhoneGreaterThan(String value) {
            addCriterion("c_com_phone >", value, "cComPhone");
            return (Criteria) this;
        }

        public Criteria andCComPhoneGreaterThanOrEqualTo(String value) {
            addCriterion("c_com_phone >=", value, "cComPhone");
            return (Criteria) this;
        }

        public Criteria andCComPhoneLessThan(String value) {
            addCriterion("c_com_phone <", value, "cComPhone");
            return (Criteria) this;
        }

        public Criteria andCComPhoneLessThanOrEqualTo(String value) {
            addCriterion("c_com_phone <=", value, "cComPhone");
            return (Criteria) this;
        }

        public Criteria andCComPhoneLike(String value) {
            addCriterion("c_com_phone like", value, "cComPhone");
            return (Criteria) this;
        }

        public Criteria andCComPhoneNotLike(String value) {
            addCriterion("c_com_phone not like", value, "cComPhone");
            return (Criteria) this;
        }

        public Criteria andCComPhoneIn(List<String> values) {
            addCriterion("c_com_phone in", values, "cComPhone");
            return (Criteria) this;
        }

        public Criteria andCComPhoneNotIn(List<String> values) {
            addCriterion("c_com_phone not in", values, "cComPhone");
            return (Criteria) this;
        }

        public Criteria andCComPhoneBetween(String value1, String value2) {
            addCriterion("c_com_phone between", value1, value2, "cComPhone");
            return (Criteria) this;
        }

        public Criteria andCComPhoneNotBetween(String value1, String value2) {
            addCriterion("c_com_phone not between", value1, value2, "cComPhone");
            return (Criteria) this;
        }

        public Criteria andCComPasswordIsNull() {
            addCriterion("c_com_password is null");
            return (Criteria) this;
        }

        public Criteria andCComPasswordIsNotNull() {
            addCriterion("c_com_password is not null");
            return (Criteria) this;
        }

        public Criteria andCComPasswordEqualTo(String value) {
            addCriterion("c_com_password =", value, "cComPassword");
            return (Criteria) this;
        }

        public Criteria andCComPasswordNotEqualTo(String value) {
            addCriterion("c_com_password <>", value, "cComPassword");
            return (Criteria) this;
        }

        public Criteria andCComPasswordGreaterThan(String value) {
            addCriterion("c_com_password >", value, "cComPassword");
            return (Criteria) this;
        }

        public Criteria andCComPasswordGreaterThanOrEqualTo(String value) {
            addCriterion("c_com_password >=", value, "cComPassword");
            return (Criteria) this;
        }

        public Criteria andCComPasswordLessThan(String value) {
            addCriterion("c_com_password <", value, "cComPassword");
            return (Criteria) this;
        }

        public Criteria andCComPasswordLessThanOrEqualTo(String value) {
            addCriterion("c_com_password <=", value, "cComPassword");
            return (Criteria) this;
        }

        public Criteria andCComPasswordLike(String value) {
            addCriterion("c_com_password like", value, "cComPassword");
            return (Criteria) this;
        }

        public Criteria andCComPasswordNotLike(String value) {
            addCriterion("c_com_password not like", value, "cComPassword");
            return (Criteria) this;
        }

        public Criteria andCComPasswordIn(List<String> values) {
            addCriterion("c_com_password in", values, "cComPassword");
            return (Criteria) this;
        }

        public Criteria andCComPasswordNotIn(List<String> values) {
            addCriterion("c_com_password not in", values, "cComPassword");
            return (Criteria) this;
        }

        public Criteria andCComPasswordBetween(String value1, String value2) {
            addCriterion("c_com_password between", value1, value2, "cComPassword");
            return (Criteria) this;
        }

        public Criteria andCComPasswordNotBetween(String value1, String value2) {
            addCriterion("c_com_password not between", value1, value2, "cComPassword");
            return (Criteria) this;
        }

        public Criteria andCComNameIsNull() {
            addCriterion("c_com_name is null");
            return (Criteria) this;
        }

        public Criteria andCComNameIsNotNull() {
            addCriterion("c_com_name is not null");
            return (Criteria) this;
        }

        public Criteria andCComNameEqualTo(String value) {
            addCriterion("c_com_name =", value, "cComName");
            return (Criteria) this;
        }

        public Criteria andCComNameNotEqualTo(String value) {
            addCriterion("c_com_name <>", value, "cComName");
            return (Criteria) this;
        }

        public Criteria andCComNameGreaterThan(String value) {
            addCriterion("c_com_name >", value, "cComName");
            return (Criteria) this;
        }

        public Criteria andCComNameGreaterThanOrEqualTo(String value) {
            addCriterion("c_com_name >=", value, "cComName");
            return (Criteria) this;
        }

        public Criteria andCComNameLessThan(String value) {
            addCriterion("c_com_name <", value, "cComName");
            return (Criteria) this;
        }

        public Criteria andCComNameLessThanOrEqualTo(String value) {
            addCriterion("c_com_name <=", value, "cComName");
            return (Criteria) this;
        }

        public Criteria andCComNameLike(String value) {
            addCriterion("c_com_name like", value, "cComName");
            return (Criteria) this;
        }

        public Criteria andCComNameNotLike(String value) {
            addCriterion("c_com_name not like", value, "cComName");
            return (Criteria) this;
        }

        public Criteria andCComNameIn(List<String> values) {
            addCriterion("c_com_name in", values, "cComName");
            return (Criteria) this;
        }

        public Criteria andCComNameNotIn(List<String> values) {
            addCriterion("c_com_name not in", values, "cComName");
            return (Criteria) this;
        }

        public Criteria andCComNameBetween(String value1, String value2) {
            addCriterion("c_com_name between", value1, value2, "cComName");
            return (Criteria) this;
        }

        public Criteria andCComNameNotBetween(String value1, String value2) {
            addCriterion("c_com_name not between", value1, value2, "cComName");
            return (Criteria) this;
        }

        public Criteria andCComBalanceIsNull() {
            addCriterion("c_com_balance is null");
            return (Criteria) this;
        }

        public Criteria andCComBalanceIsNotNull() {
            addCriterion("c_com_balance is not null");
            return (Criteria) this;
        }

        public Criteria andCComBalanceEqualTo(String value) {
            addCriterion("c_com_balance =", value, "cComBalance");
            return (Criteria) this;
        }

        public Criteria andCComBalanceNotEqualTo(String value) {
            addCriterion("c_com_balance <>", value, "cComBalance");
            return (Criteria) this;
        }

        public Criteria andCComBalanceGreaterThan(String value) {
            addCriterion("c_com_balance >", value, "cComBalance");
            return (Criteria) this;
        }

        public Criteria andCComBalanceGreaterThanOrEqualTo(String value) {
            addCriterion("c_com_balance >=", value, "cComBalance");
            return (Criteria) this;
        }

        public Criteria andCComBalanceLessThan(String value) {
            addCriterion("c_com_balance <", value, "cComBalance");
            return (Criteria) this;
        }

        public Criteria andCComBalanceLessThanOrEqualTo(String value) {
            addCriterion("c_com_balance <=", value, "cComBalance");
            return (Criteria) this;
        }

        public Criteria andCComBalanceLike(String value) {
            addCriterion("c_com_balance like", value, "cComBalance");
            return (Criteria) this;
        }

        public Criteria andCComBalanceNotLike(String value) {
            addCriterion("c_com_balance not like", value, "cComBalance");
            return (Criteria) this;
        }

        public Criteria andCComBalanceIn(List<String> values) {
            addCriterion("c_com_balance in", values, "cComBalance");
            return (Criteria) this;
        }

        public Criteria andCComBalanceNotIn(List<String> values) {
            addCriterion("c_com_balance not in", values, "cComBalance");
            return (Criteria) this;
        }

        public Criteria andCComBalanceBetween(String value1, String value2) {
            addCriterion("c_com_balance between", value1, value2, "cComBalance");
            return (Criteria) this;
        }

        public Criteria andCComBalanceNotBetween(String value1, String value2) {
            addCriterion("c_com_balance not between", value1, value2, "cComBalance");
            return (Criteria) this;
        }

        public Criteria andCComScoreIsNull() {
            addCriterion("c_com_score is null");
            return (Criteria) this;
        }

        public Criteria andCComScoreIsNotNull() {
            addCriterion("c_com_score is not null");
            return (Criteria) this;
        }

        public Criteria andCComScoreEqualTo(String value) {
            addCriterion("c_com_score =", value, "cComScore");
            return (Criteria) this;
        }

        public Criteria andCComScoreNotEqualTo(String value) {
            addCriterion("c_com_score <>", value, "cComScore");
            return (Criteria) this;
        }

        public Criteria andCComScoreGreaterThan(String value) {
            addCriterion("c_com_score >", value, "cComScore");
            return (Criteria) this;
        }

        public Criteria andCComScoreGreaterThanOrEqualTo(String value) {
            addCriterion("c_com_score >=", value, "cComScore");
            return (Criteria) this;
        }

        public Criteria andCComScoreLessThan(String value) {
            addCriterion("c_com_score <", value, "cComScore");
            return (Criteria) this;
        }

        public Criteria andCComScoreLessThanOrEqualTo(String value) {
            addCriterion("c_com_score <=", value, "cComScore");
            return (Criteria) this;
        }

        public Criteria andCComScoreLike(String value) {
            addCriterion("c_com_score like", value, "cComScore");
            return (Criteria) this;
        }

        public Criteria andCComScoreNotLike(String value) {
            addCriterion("c_com_score not like", value, "cComScore");
            return (Criteria) this;
        }

        public Criteria andCComScoreIn(List<String> values) {
            addCriterion("c_com_score in", values, "cComScore");
            return (Criteria) this;
        }

        public Criteria andCComScoreNotIn(List<String> values) {
            addCriterion("c_com_score not in", values, "cComScore");
            return (Criteria) this;
        }

        public Criteria andCComScoreBetween(String value1, String value2) {
            addCriterion("c_com_score between", value1, value2, "cComScore");
            return (Criteria) this;
        }

        public Criteria andCComScoreNotBetween(String value1, String value2) {
            addCriterion("c_com_score not between", value1, value2, "cComScore");
            return (Criteria) this;
        }

        public Criteria andCComHeadImgIsNull() {
            addCriterion("c_com_head_img is null");
            return (Criteria) this;
        }

        public Criteria andCComHeadImgIsNotNull() {
            addCriterion("c_com_head_img is not null");
            return (Criteria) this;
        }

        public Criteria andCComHeadImgEqualTo(String value) {
            addCriterion("c_com_head_img =", value, "cComHeadImg");
            return (Criteria) this;
        }

        public Criteria andCComHeadImgNotEqualTo(String value) {
            addCriterion("c_com_head_img <>", value, "cComHeadImg");
            return (Criteria) this;
        }

        public Criteria andCComHeadImgGreaterThan(String value) {
            addCriterion("c_com_head_img >", value, "cComHeadImg");
            return (Criteria) this;
        }

        public Criteria andCComHeadImgGreaterThanOrEqualTo(String value) {
            addCriterion("c_com_head_img >=", value, "cComHeadImg");
            return (Criteria) this;
        }

        public Criteria andCComHeadImgLessThan(String value) {
            addCriterion("c_com_head_img <", value, "cComHeadImg");
            return (Criteria) this;
        }

        public Criteria andCComHeadImgLessThanOrEqualTo(String value) {
            addCriterion("c_com_head_img <=", value, "cComHeadImg");
            return (Criteria) this;
        }

        public Criteria andCComHeadImgLike(String value) {
            addCriterion("c_com_head_img like", value, "cComHeadImg");
            return (Criteria) this;
        }

        public Criteria andCComHeadImgNotLike(String value) {
            addCriterion("c_com_head_img not like", value, "cComHeadImg");
            return (Criteria) this;
        }

        public Criteria andCComHeadImgIn(List<String> values) {
            addCriterion("c_com_head_img in", values, "cComHeadImg");
            return (Criteria) this;
        }

        public Criteria andCComHeadImgNotIn(List<String> values) {
            addCriterion("c_com_head_img not in", values, "cComHeadImg");
            return (Criteria) this;
        }

        public Criteria andCComHeadImgBetween(String value1, String value2) {
            addCriterion("c_com_head_img between", value1, value2, "cComHeadImg");
            return (Criteria) this;
        }

        public Criteria andCComHeadImgNotBetween(String value1, String value2) {
            addCriterion("c_com_head_img not between", value1, value2, "cComHeadImg");
            return (Criteria) this;
        }

        public Criteria andCComAddressIdIsNull() {
            addCriterion("c_com_address_id is null");
            return (Criteria) this;
        }

        public Criteria andCComAddressIdIsNotNull() {
            addCriterion("c_com_address_id is not null");
            return (Criteria) this;
        }

        public Criteria andCComAddressIdEqualTo(Integer value) {
            addCriterion("c_com_address_id =", value, "cComAddressId");
            return (Criteria) this;
        }

        public Criteria andCComAddressIdNotEqualTo(Integer value) {
            addCriterion("c_com_address_id <>", value, "cComAddressId");
            return (Criteria) this;
        }

        public Criteria andCComAddressIdGreaterThan(Integer value) {
            addCriterion("c_com_address_id >", value, "cComAddressId");
            return (Criteria) this;
        }

        public Criteria andCComAddressIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("c_com_address_id >=", value, "cComAddressId");
            return (Criteria) this;
        }

        public Criteria andCComAddressIdLessThan(Integer value) {
            addCriterion("c_com_address_id <", value, "cComAddressId");
            return (Criteria) this;
        }

        public Criteria andCComAddressIdLessThanOrEqualTo(Integer value) {
            addCriterion("c_com_address_id <=", value, "cComAddressId");
            return (Criteria) this;
        }

        public Criteria andCComAddressIdIn(List<Integer> values) {
            addCriterion("c_com_address_id in", values, "cComAddressId");
            return (Criteria) this;
        }

        public Criteria andCComAddressIdNotIn(List<Integer> values) {
            addCriterion("c_com_address_id not in", values, "cComAddressId");
            return (Criteria) this;
        }

        public Criteria andCComAddressIdBetween(Integer value1, Integer value2) {
            addCriterion("c_com_address_id between", value1, value2, "cComAddressId");
            return (Criteria) this;
        }

        public Criteria andCComAddressIdNotBetween(Integer value1, Integer value2) {
            addCriterion("c_com_address_id not between", value1, value2, "cComAddressId");
            return (Criteria) this;
        }

        public Criteria andCComLicenseImgIsNull() {
            addCriterion("c_com_license_img is null");
            return (Criteria) this;
        }

        public Criteria andCComLicenseImgIsNotNull() {
            addCriterion("c_com_license_img is not null");
            return (Criteria) this;
        }

        public Criteria andCComLicenseImgEqualTo(String value) {
            addCriterion("c_com_license_img =", value, "cComLicenseImg");
            return (Criteria) this;
        }

        public Criteria andCComLicenseImgNotEqualTo(String value) {
            addCriterion("c_com_license_img <>", value, "cComLicenseImg");
            return (Criteria) this;
        }

        public Criteria andCComLicenseImgGreaterThan(String value) {
            addCriterion("c_com_license_img >", value, "cComLicenseImg");
            return (Criteria) this;
        }

        public Criteria andCComLicenseImgGreaterThanOrEqualTo(String value) {
            addCriterion("c_com_license_img >=", value, "cComLicenseImg");
            return (Criteria) this;
        }

        public Criteria andCComLicenseImgLessThan(String value) {
            addCriterion("c_com_license_img <", value, "cComLicenseImg");
            return (Criteria) this;
        }

        public Criteria andCComLicenseImgLessThanOrEqualTo(String value) {
            addCriterion("c_com_license_img <=", value, "cComLicenseImg");
            return (Criteria) this;
        }

        public Criteria andCComLicenseImgLike(String value) {
            addCriterion("c_com_license_img like", value, "cComLicenseImg");
            return (Criteria) this;
        }

        public Criteria andCComLicenseImgNotLike(String value) {
            addCriterion("c_com_license_img not like", value, "cComLicenseImg");
            return (Criteria) this;
        }

        public Criteria andCComLicenseImgIn(List<String> values) {
            addCriterion("c_com_license_img in", values, "cComLicenseImg");
            return (Criteria) this;
        }

        public Criteria andCComLicenseImgNotIn(List<String> values) {
            addCriterion("c_com_license_img not in", values, "cComLicenseImg");
            return (Criteria) this;
        }

        public Criteria andCComLicenseImgBetween(String value1, String value2) {
            addCriterion("c_com_license_img between", value1, value2, "cComLicenseImg");
            return (Criteria) this;
        }

        public Criteria andCComLicenseImgNotBetween(String value1, String value2) {
            addCriterion("c_com_license_img not between", value1, value2, "cComLicenseImg");
            return (Criteria) this;
        }

        public Criteria andCUserStateIsNull() {
            addCriterion("c_user_state is null");
            return (Criteria) this;
        }

        public Criteria andCUserStateIsNotNull() {
            addCriterion("c_user_state is not null");
            return (Criteria) this;
        }

        public Criteria andCUserStateEqualTo(String value) {
            addCriterion("c_user_state =", value, "cUserState");
            return (Criteria) this;
        }

        public Criteria andCUserStateNotEqualTo(String value) {
            addCriterion("c_user_state <>", value, "cUserState");
            return (Criteria) this;
        }

        public Criteria andCUserStateGreaterThan(String value) {
            addCriterion("c_user_state >", value, "cUserState");
            return (Criteria) this;
        }

        public Criteria andCUserStateGreaterThanOrEqualTo(String value) {
            addCriterion("c_user_state >=", value, "cUserState");
            return (Criteria) this;
        }

        public Criteria andCUserStateLessThan(String value) {
            addCriterion("c_user_state <", value, "cUserState");
            return (Criteria) this;
        }

        public Criteria andCUserStateLessThanOrEqualTo(String value) {
            addCriterion("c_user_state <=", value, "cUserState");
            return (Criteria) this;
        }

        public Criteria andCUserStateLike(String value) {
            addCriterion("c_user_state like", value, "cUserState");
            return (Criteria) this;
        }

        public Criteria andCUserStateNotLike(String value) {
            addCriterion("c_user_state not like", value, "cUserState");
            return (Criteria) this;
        }

        public Criteria andCUserStateIn(List<String> values) {
            addCriterion("c_user_state in", values, "cUserState");
            return (Criteria) this;
        }

        public Criteria andCUserStateNotIn(List<String> values) {
            addCriterion("c_user_state not in", values, "cUserState");
            return (Criteria) this;
        }

        public Criteria andCUserStateBetween(String value1, String value2) {
            addCriterion("c_user_state between", value1, value2, "cUserState");
            return (Criteria) this;
        }

        public Criteria andCUserStateNotBetween(String value1, String value2) {
            addCriterion("c_user_state not between", value1, value2, "cUserState");
            return (Criteria) this;
        }

        public Criteria andCExtraBalanceIsNull() {
            addCriterion("c_extra_balance is null");
            return (Criteria) this;
        }

        public Criteria andCExtraBalanceIsNotNull() {
            addCriterion("c_extra_balance is not null");
            return (Criteria) this;
        }

        public Criteria andCExtraBalanceEqualTo(String value) {
            addCriterion("c_extra_balance =", value, "cExtraBalance");
            return (Criteria) this;
        }

        public Criteria andCExtraBalanceNotEqualTo(String value) {
            addCriterion("c_extra_balance <>", value, "cExtraBalance");
            return (Criteria) this;
        }

        public Criteria andCExtraBalanceGreaterThan(String value) {
            addCriterion("c_extra_balance >", value, "cExtraBalance");
            return (Criteria) this;
        }

        public Criteria andCExtraBalanceGreaterThanOrEqualTo(String value) {
            addCriterion("c_extra_balance >=", value, "cExtraBalance");
            return (Criteria) this;
        }

        public Criteria andCExtraBalanceLessThan(String value) {
            addCriterion("c_extra_balance <", value, "cExtraBalance");
            return (Criteria) this;
        }

        public Criteria andCExtraBalanceLessThanOrEqualTo(String value) {
            addCriterion("c_extra_balance <=", value, "cExtraBalance");
            return (Criteria) this;
        }

        public Criteria andCExtraBalanceLike(String value) {
            addCriterion("c_extra_balance like", value, "cExtraBalance");
            return (Criteria) this;
        }

        public Criteria andCExtraBalanceNotLike(String value) {
            addCriterion("c_extra_balance not like", value, "cExtraBalance");
            return (Criteria) this;
        }

        public Criteria andCExtraBalanceIn(List<String> values) {
            addCriterion("c_extra_balance in", values, "cExtraBalance");
            return (Criteria) this;
        }

        public Criteria andCExtraBalanceNotIn(List<String> values) {
            addCriterion("c_extra_balance not in", values, "cExtraBalance");
            return (Criteria) this;
        }

        public Criteria andCExtraBalanceBetween(String value1, String value2) {
            addCriterion("c_extra_balance between", value1, value2, "cExtraBalance");
            return (Criteria) this;
        }

        public Criteria andCExtraBalanceNotBetween(String value1, String value2) {
            addCriterion("c_extra_balance not between", value1, value2, "cExtraBalance");
            return (Criteria) this;
        }

        public Criteria andCComHaslicenseIsNull() {
            addCriterion("c_com_hasLicense is null");
            return (Criteria) this;
        }

        public Criteria andCComHaslicenseIsNotNull() {
            addCriterion("c_com_hasLicense is not null");
            return (Criteria) this;
        }

        public Criteria andCComHaslicenseEqualTo(String value) {
            addCriterion("c_com_hasLicense =", value, "cComHaslicense");
            return (Criteria) this;
        }

        public Criteria andCComHaslicenseNotEqualTo(String value) {
            addCriterion("c_com_hasLicense <>", value, "cComHaslicense");
            return (Criteria) this;
        }

        public Criteria andCComHaslicenseGreaterThan(String value) {
            addCriterion("c_com_hasLicense >", value, "cComHaslicense");
            return (Criteria) this;
        }

        public Criteria andCComHaslicenseGreaterThanOrEqualTo(String value) {
            addCriterion("c_com_hasLicense >=", value, "cComHaslicense");
            return (Criteria) this;
        }

        public Criteria andCComHaslicenseLessThan(String value) {
            addCriterion("c_com_hasLicense <", value, "cComHaslicense");
            return (Criteria) this;
        }

        public Criteria andCComHaslicenseLessThanOrEqualTo(String value) {
            addCriterion("c_com_hasLicense <=", value, "cComHaslicense");
            return (Criteria) this;
        }

        public Criteria andCComHaslicenseLike(String value) {
            addCriterion("c_com_hasLicense like", value, "cComHaslicense");
            return (Criteria) this;
        }

        public Criteria andCComHaslicenseNotLike(String value) {
            addCriterion("c_com_hasLicense not like", value, "cComHaslicense");
            return (Criteria) this;
        }

        public Criteria andCComHaslicenseIn(List<String> values) {
            addCriterion("c_com_hasLicense in", values, "cComHaslicense");
            return (Criteria) this;
        }

        public Criteria andCComHaslicenseNotIn(List<String> values) {
            addCriterion("c_com_hasLicense not in", values, "cComHaslicense");
            return (Criteria) this;
        }

        public Criteria andCComHaslicenseBetween(String value1, String value2) {
            addCriterion("c_com_hasLicense between", value1, value2, "cComHaslicense");
            return (Criteria) this;
        }

        public Criteria andCComHaslicenseNotBetween(String value1, String value2) {
            addCriterion("c_com_hasLicense not between", value1, value2, "cComHaslicense");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}