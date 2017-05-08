package com.starjobs.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class TUserInfoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TUserInfoExample() {
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

        protected void addCriterionForJDBCDate(String condition, Date value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value.getTime()), property);
        }

        protected void addCriterionForJDBCDate(String condition, List<Date> values, String property) {
            if (values == null || values.size() == 0) {
                throw new RuntimeException("Value list for " + property + " cannot be null or empty");
            }
            List<java.sql.Date> dateList = new ArrayList<java.sql.Date>();
            Iterator<Date> iter = values.iterator();
            while (iter.hasNext()) {
                dateList.add(new java.sql.Date(iter.next().getTime()));
            }
            addCriterion(condition, dateList, property);
        }

        protected void addCriterionForJDBCDate(String condition, Date value1, Date value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value1.getTime()), new java.sql.Date(value2.getTime()), property);
        }

        public Criteria andCUserIdIsNull() {
            addCriterion("c_user_id is null");
            return (Criteria) this;
        }

        public Criteria andCUserIdIsNotNull() {
            addCriterion("c_user_id is not null");
            return (Criteria) this;
        }

        public Criteria andCUserIdEqualTo(Integer value) {
            addCriterion("c_user_id =", value, "cUserId");
            return (Criteria) this;
        }

        public Criteria andCUserIdNotEqualTo(Integer value) {
            addCriterion("c_user_id <>", value, "cUserId");
            return (Criteria) this;
        }

        public Criteria andCUserIdGreaterThan(Integer value) {
            addCriterion("c_user_id >", value, "cUserId");
            return (Criteria) this;
        }

        public Criteria andCUserIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("c_user_id >=", value, "cUserId");
            return (Criteria) this;
        }

        public Criteria andCUserIdLessThan(Integer value) {
            addCriterion("c_user_id <", value, "cUserId");
            return (Criteria) this;
        }

        public Criteria andCUserIdLessThanOrEqualTo(Integer value) {
            addCriterion("c_user_id <=", value, "cUserId");
            return (Criteria) this;
        }

        public Criteria andCUserIdIn(List<Integer> values) {
            addCriterion("c_user_id in", values, "cUserId");
            return (Criteria) this;
        }

        public Criteria andCUserIdNotIn(List<Integer> values) {
            addCriterion("c_user_id not in", values, "cUserId");
            return (Criteria) this;
        }

        public Criteria andCUserIdBetween(Integer value1, Integer value2) {
            addCriterion("c_user_id between", value1, value2, "cUserId");
            return (Criteria) this;
        }

        public Criteria andCUserIdNotBetween(Integer value1, Integer value2) {
            addCriterion("c_user_id not between", value1, value2, "cUserId");
            return (Criteria) this;
        }

        public Criteria andCUserPhoneIsNull() {
            addCriterion("c_user_phone is null");
            return (Criteria) this;
        }

        public Criteria andCUserPhoneIsNotNull() {
            addCriterion("c_user_phone is not null");
            return (Criteria) this;
        }

        public Criteria andCUserPhoneEqualTo(String value) {
            addCriterion("c_user_phone =", value, "cUserPhone");
            return (Criteria) this;
        }

        public Criteria andCUserPhoneNotEqualTo(String value) {
            addCriterion("c_user_phone <>", value, "cUserPhone");
            return (Criteria) this;
        }

        public Criteria andCUserPhoneGreaterThan(String value) {
            addCriterion("c_user_phone >", value, "cUserPhone");
            return (Criteria) this;
        }

        public Criteria andCUserPhoneGreaterThanOrEqualTo(String value) {
            addCriterion("c_user_phone >=", value, "cUserPhone");
            return (Criteria) this;
        }

        public Criteria andCUserPhoneLessThan(String value) {
            addCriterion("c_user_phone <", value, "cUserPhone");
            return (Criteria) this;
        }

        public Criteria andCUserPhoneLessThanOrEqualTo(String value) {
            addCriterion("c_user_phone <=", value, "cUserPhone");
            return (Criteria) this;
        }

        public Criteria andCUserPhoneLike(String value) {
            addCriterion("c_user_phone like", value, "cUserPhone");
            return (Criteria) this;
        }

        public Criteria andCUserPhoneNotLike(String value) {
            addCriterion("c_user_phone not like", value, "cUserPhone");
            return (Criteria) this;
        }

        public Criteria andCUserPhoneIn(List<String> values) {
            addCriterion("c_user_phone in", values, "cUserPhone");
            return (Criteria) this;
        }

        public Criteria andCUserPhoneNotIn(List<String> values) {
            addCriterion("c_user_phone not in", values, "cUserPhone");
            return (Criteria) this;
        }

        public Criteria andCUserPhoneBetween(String value1, String value2) {
            addCriterion("c_user_phone between", value1, value2, "cUserPhone");
            return (Criteria) this;
        }

        public Criteria andCUserPhoneNotBetween(String value1, String value2) {
            addCriterion("c_user_phone not between", value1, value2, "cUserPhone");
            return (Criteria) this;
        }

        public Criteria andCUserPasswordIsNull() {
            addCriterion("c_user_password is null");
            return (Criteria) this;
        }

        public Criteria andCUserPasswordIsNotNull() {
            addCriterion("c_user_password is not null");
            return (Criteria) this;
        }

        public Criteria andCUserPasswordEqualTo(String value) {
            addCriterion("c_user_password =", value, "cUserPassword");
            return (Criteria) this;
        }

        public Criteria andCUserPasswordNotEqualTo(String value) {
            addCriterion("c_user_password <>", value, "cUserPassword");
            return (Criteria) this;
        }

        public Criteria andCUserPasswordGreaterThan(String value) {
            addCriterion("c_user_password >", value, "cUserPassword");
            return (Criteria) this;
        }

        public Criteria andCUserPasswordGreaterThanOrEqualTo(String value) {
            addCriterion("c_user_password >=", value, "cUserPassword");
            return (Criteria) this;
        }

        public Criteria andCUserPasswordLessThan(String value) {
            addCriterion("c_user_password <", value, "cUserPassword");
            return (Criteria) this;
        }

        public Criteria andCUserPasswordLessThanOrEqualTo(String value) {
            addCriterion("c_user_password <=", value, "cUserPassword");
            return (Criteria) this;
        }

        public Criteria andCUserPasswordLike(String value) {
            addCriterion("c_user_password like", value, "cUserPassword");
            return (Criteria) this;
        }

        public Criteria andCUserPasswordNotLike(String value) {
            addCriterion("c_user_password not like", value, "cUserPassword");
            return (Criteria) this;
        }

        public Criteria andCUserPasswordIn(List<String> values) {
            addCriterion("c_user_password in", values, "cUserPassword");
            return (Criteria) this;
        }

        public Criteria andCUserPasswordNotIn(List<String> values) {
            addCriterion("c_user_password not in", values, "cUserPassword");
            return (Criteria) this;
        }

        public Criteria andCUserPasswordBetween(String value1, String value2) {
            addCriterion("c_user_password between", value1, value2, "cUserPassword");
            return (Criteria) this;
        }

        public Criteria andCUserPasswordNotBetween(String value1, String value2) {
            addCriterion("c_user_password not between", value1, value2, "cUserPassword");
            return (Criteria) this;
        }

        public Criteria andCUserNicknameIsNull() {
            addCriterion("c_user_nickname is null");
            return (Criteria) this;
        }

        public Criteria andCUserNicknameIsNotNull() {
            addCriterion("c_user_nickname is not null");
            return (Criteria) this;
        }

        public Criteria andCUserNicknameEqualTo(String value) {
            addCriterion("c_user_nickname =", value, "cUserNickname");
            return (Criteria) this;
        }

        public Criteria andCUserNicknameNotEqualTo(String value) {
            addCriterion("c_user_nickname <>", value, "cUserNickname");
            return (Criteria) this;
        }

        public Criteria andCUserNicknameGreaterThan(String value) {
            addCriterion("c_user_nickname >", value, "cUserNickname");
            return (Criteria) this;
        }

        public Criteria andCUserNicknameGreaterThanOrEqualTo(String value) {
            addCriterion("c_user_nickname >=", value, "cUserNickname");
            return (Criteria) this;
        }

        public Criteria andCUserNicknameLessThan(String value) {
            addCriterion("c_user_nickname <", value, "cUserNickname");
            return (Criteria) this;
        }

        public Criteria andCUserNicknameLessThanOrEqualTo(String value) {
            addCriterion("c_user_nickname <=", value, "cUserNickname");
            return (Criteria) this;
        }

        public Criteria andCUserNicknameLike(String value) {
            addCriterion("c_user_nickname like", value, "cUserNickname");
            return (Criteria) this;
        }

        public Criteria andCUserNicknameNotLike(String value) {
            addCriterion("c_user_nickname not like", value, "cUserNickname");
            return (Criteria) this;
        }

        public Criteria andCUserNicknameIn(List<String> values) {
            addCriterion("c_user_nickname in", values, "cUserNickname");
            return (Criteria) this;
        }

        public Criteria andCUserNicknameNotIn(List<String> values) {
            addCriterion("c_user_nickname not in", values, "cUserNickname");
            return (Criteria) this;
        }

        public Criteria andCUserNicknameBetween(String value1, String value2) {
            addCriterion("c_user_nickname between", value1, value2, "cUserNickname");
            return (Criteria) this;
        }

        public Criteria andCUserNicknameNotBetween(String value1, String value2) {
            addCriterion("c_user_nickname not between", value1, value2, "cUserNickname");
            return (Criteria) this;
        }

        public Criteria andCUsernameIsNull() {
            addCriterion("c_username is null");
            return (Criteria) this;
        }

        public Criteria andCUsernameIsNotNull() {
            addCriterion("c_username is not null");
            return (Criteria) this;
        }

        public Criteria andCUsernameEqualTo(String value) {
            addCriterion("c_username =", value, "cUsername");
            return (Criteria) this;
        }

        public Criteria andCUsernameNotEqualTo(String value) {
            addCriterion("c_username <>", value, "cUsername");
            return (Criteria) this;
        }

        public Criteria andCUsernameGreaterThan(String value) {
            addCriterion("c_username >", value, "cUsername");
            return (Criteria) this;
        }

        public Criteria andCUsernameGreaterThanOrEqualTo(String value) {
            addCriterion("c_username >=", value, "cUsername");
            return (Criteria) this;
        }

        public Criteria andCUsernameLessThan(String value) {
            addCriterion("c_username <", value, "cUsername");
            return (Criteria) this;
        }

        public Criteria andCUsernameLessThanOrEqualTo(String value) {
            addCriterion("c_username <=", value, "cUsername");
            return (Criteria) this;
        }

        public Criteria andCUsernameLike(String value) {
            addCriterion("c_username like", value, "cUsername");
            return (Criteria) this;
        }

        public Criteria andCUsernameNotLike(String value) {
            addCriterion("c_username not like", value, "cUsername");
            return (Criteria) this;
        }

        public Criteria andCUsernameIn(List<String> values) {
            addCriterion("c_username in", values, "cUsername");
            return (Criteria) this;
        }

        public Criteria andCUsernameNotIn(List<String> values) {
            addCriterion("c_username not in", values, "cUsername");
            return (Criteria) this;
        }

        public Criteria andCUsernameBetween(String value1, String value2) {
            addCriterion("c_username between", value1, value2, "cUsername");
            return (Criteria) this;
        }

        public Criteria andCUsernameNotBetween(String value1, String value2) {
            addCriterion("c_username not between", value1, value2, "cUsername");
            return (Criteria) this;
        }

        public Criteria andCUserAliAccountIsNull() {
            addCriterion("c_user_ali_account is null");
            return (Criteria) this;
        }

        public Criteria andCUserAliAccountIsNotNull() {
            addCriterion("c_user_ali_account is not null");
            return (Criteria) this;
        }

        public Criteria andCUserAliAccountEqualTo(String value) {
            addCriterion("c_user_ali_account =", value, "cUserAliAccount");
            return (Criteria) this;
        }

        public Criteria andCUserAliAccountNotEqualTo(String value) {
            addCriterion("c_user_ali_account <>", value, "cUserAliAccount");
            return (Criteria) this;
        }

        public Criteria andCUserAliAccountGreaterThan(String value) {
            addCriterion("c_user_ali_account >", value, "cUserAliAccount");
            return (Criteria) this;
        }

        public Criteria andCUserAliAccountGreaterThanOrEqualTo(String value) {
            addCriterion("c_user_ali_account >=", value, "cUserAliAccount");
            return (Criteria) this;
        }

        public Criteria andCUserAliAccountLessThan(String value) {
            addCriterion("c_user_ali_account <", value, "cUserAliAccount");
            return (Criteria) this;
        }

        public Criteria andCUserAliAccountLessThanOrEqualTo(String value) {
            addCriterion("c_user_ali_account <=", value, "cUserAliAccount");
            return (Criteria) this;
        }

        public Criteria andCUserAliAccountLike(String value) {
            addCriterion("c_user_ali_account like", value, "cUserAliAccount");
            return (Criteria) this;
        }

        public Criteria andCUserAliAccountNotLike(String value) {
            addCriterion("c_user_ali_account not like", value, "cUserAliAccount");
            return (Criteria) this;
        }

        public Criteria andCUserAliAccountIn(List<String> values) {
            addCriterion("c_user_ali_account in", values, "cUserAliAccount");
            return (Criteria) this;
        }

        public Criteria andCUserAliAccountNotIn(List<String> values) {
            addCriterion("c_user_ali_account not in", values, "cUserAliAccount");
            return (Criteria) this;
        }

        public Criteria andCUserAliAccountBetween(String value1, String value2) {
            addCriterion("c_user_ali_account between", value1, value2, "cUserAliAccount");
            return (Criteria) this;
        }

        public Criteria andCUserAliAccountNotBetween(String value1, String value2) {
            addCriterion("c_user_ali_account not between", value1, value2, "cUserAliAccount");
            return (Criteria) this;
        }

        public Criteria andCUserGenderIsNull() {
            addCriterion("c_user_gender is null");
            return (Criteria) this;
        }

        public Criteria andCUserGenderIsNotNull() {
            addCriterion("c_user_gender is not null");
            return (Criteria) this;
        }

        public Criteria andCUserGenderEqualTo(String value) {
            addCriterion("c_user_gender =", value, "cUserGender");
            return (Criteria) this;
        }

        public Criteria andCUserGenderNotEqualTo(String value) {
            addCriterion("c_user_gender <>", value, "cUserGender");
            return (Criteria) this;
        }

        public Criteria andCUserGenderGreaterThan(String value) {
            addCriterion("c_user_gender >", value, "cUserGender");
            return (Criteria) this;
        }

        public Criteria andCUserGenderGreaterThanOrEqualTo(String value) {
            addCriterion("c_user_gender >=", value, "cUserGender");
            return (Criteria) this;
        }

        public Criteria andCUserGenderLessThan(String value) {
            addCriterion("c_user_gender <", value, "cUserGender");
            return (Criteria) this;
        }

        public Criteria andCUserGenderLessThanOrEqualTo(String value) {
            addCriterion("c_user_gender <=", value, "cUserGender");
            return (Criteria) this;
        }

        public Criteria andCUserGenderLike(String value) {
            addCriterion("c_user_gender like", value, "cUserGender");
            return (Criteria) this;
        }

        public Criteria andCUserGenderNotLike(String value) {
            addCriterion("c_user_gender not like", value, "cUserGender");
            return (Criteria) this;
        }

        public Criteria andCUserGenderIn(List<String> values) {
            addCriterion("c_user_gender in", values, "cUserGender");
            return (Criteria) this;
        }

        public Criteria andCUserGenderNotIn(List<String> values) {
            addCriterion("c_user_gender not in", values, "cUserGender");
            return (Criteria) this;
        }

        public Criteria andCUserGenderBetween(String value1, String value2) {
            addCriterion("c_user_gender between", value1, value2, "cUserGender");
            return (Criteria) this;
        }

        public Criteria andCUserGenderNotBetween(String value1, String value2) {
            addCriterion("c_user_gender not between", value1, value2, "cUserGender");
            return (Criteria) this;
        }

        public Criteria andCUserBirthDateIsNull() {
            addCriterion("c_user_birth_date is null");
            return (Criteria) this;
        }

        public Criteria andCUserBirthDateIsNotNull() {
            addCriterion("c_user_birth_date is not null");
            return (Criteria) this;
        }

        public Criteria andCUserBirthDateEqualTo(Date value) {
            addCriterionForJDBCDate("c_user_birth_date =", value, "cUserBirthDate");
            return (Criteria) this;
        }

        public Criteria andCUserBirthDateNotEqualTo(Date value) {
            addCriterionForJDBCDate("c_user_birth_date <>", value, "cUserBirthDate");
            return (Criteria) this;
        }

        public Criteria andCUserBirthDateGreaterThan(Date value) {
            addCriterionForJDBCDate("c_user_birth_date >", value, "cUserBirthDate");
            return (Criteria) this;
        }

        public Criteria andCUserBirthDateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("c_user_birth_date >=", value, "cUserBirthDate");
            return (Criteria) this;
        }

        public Criteria andCUserBirthDateLessThan(Date value) {
            addCriterionForJDBCDate("c_user_birth_date <", value, "cUserBirthDate");
            return (Criteria) this;
        }

        public Criteria andCUserBirthDateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("c_user_birth_date <=", value, "cUserBirthDate");
            return (Criteria) this;
        }

        public Criteria andCUserBirthDateIn(List<Date> values) {
            addCriterionForJDBCDate("c_user_birth_date in", values, "cUserBirthDate");
            return (Criteria) this;
        }

        public Criteria andCUserBirthDateNotIn(List<Date> values) {
            addCriterionForJDBCDate("c_user_birth_date not in", values, "cUserBirthDate");
            return (Criteria) this;
        }

        public Criteria andCUserBirthDateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("c_user_birth_date between", value1, value2, "cUserBirthDate");
            return (Criteria) this;
        }

        public Criteria andCUserBirthDateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("c_user_birth_date not between", value1, value2, "cUserBirthDate");
            return (Criteria) this;
        }

        public Criteria andCUserHeightIsNull() {
            addCriterion("c_user_height is null");
            return (Criteria) this;
        }

        public Criteria andCUserHeightIsNotNull() {
            addCriterion("c_user_height is not null");
            return (Criteria) this;
        }

        public Criteria andCUserHeightEqualTo(String value) {
            addCriterion("c_user_height =", value, "cUserHeight");
            return (Criteria) this;
        }

        public Criteria andCUserHeightNotEqualTo(String value) {
            addCriterion("c_user_height <>", value, "cUserHeight");
            return (Criteria) this;
        }

        public Criteria andCUserHeightGreaterThan(String value) {
            addCriterion("c_user_height >", value, "cUserHeight");
            return (Criteria) this;
        }

        public Criteria andCUserHeightGreaterThanOrEqualTo(String value) {
            addCriterion("c_user_height >=", value, "cUserHeight");
            return (Criteria) this;
        }

        public Criteria andCUserHeightLessThan(String value) {
            addCriterion("c_user_height <", value, "cUserHeight");
            return (Criteria) this;
        }

        public Criteria andCUserHeightLessThanOrEqualTo(String value) {
            addCriterion("c_user_height <=", value, "cUserHeight");
            return (Criteria) this;
        }

        public Criteria andCUserHeightLike(String value) {
            addCriterion("c_user_height like", value, "cUserHeight");
            return (Criteria) this;
        }

        public Criteria andCUserHeightNotLike(String value) {
            addCriterion("c_user_height not like", value, "cUserHeight");
            return (Criteria) this;
        }

        public Criteria andCUserHeightIn(List<String> values) {
            addCriterion("c_user_height in", values, "cUserHeight");
            return (Criteria) this;
        }

        public Criteria andCUserHeightNotIn(List<String> values) {
            addCriterion("c_user_height not in", values, "cUserHeight");
            return (Criteria) this;
        }

        public Criteria andCUserHeightBetween(String value1, String value2) {
            addCriterion("c_user_height between", value1, value2, "cUserHeight");
            return (Criteria) this;
        }

        public Criteria andCUserHeightNotBetween(String value1, String value2) {
            addCriterion("c_user_height not between", value1, value2, "cUserHeight");
            return (Criteria) this;
        }

        public Criteria andCUserEduStateIsNull() {
            addCriterion("c_user_edu_state is null");
            return (Criteria) this;
        }

        public Criteria andCUserEduStateIsNotNull() {
            addCriterion("c_user_edu_state is not null");
            return (Criteria) this;
        }

        public Criteria andCUserEduStateEqualTo(String value) {
            addCriterion("c_user_edu_state =", value, "cUserEduState");
            return (Criteria) this;
        }

        public Criteria andCUserEduStateNotEqualTo(String value) {
            addCriterion("c_user_edu_state <>", value, "cUserEduState");
            return (Criteria) this;
        }

        public Criteria andCUserEduStateGreaterThan(String value) {
            addCriterion("c_user_edu_state >", value, "cUserEduState");
            return (Criteria) this;
        }

        public Criteria andCUserEduStateGreaterThanOrEqualTo(String value) {
            addCriterion("c_user_edu_state >=", value, "cUserEduState");
            return (Criteria) this;
        }

        public Criteria andCUserEduStateLessThan(String value) {
            addCriterion("c_user_edu_state <", value, "cUserEduState");
            return (Criteria) this;
        }

        public Criteria andCUserEduStateLessThanOrEqualTo(String value) {
            addCriterion("c_user_edu_state <=", value, "cUserEduState");
            return (Criteria) this;
        }

        public Criteria andCUserEduStateLike(String value) {
            addCriterion("c_user_edu_state like", value, "cUserEduState");
            return (Criteria) this;
        }

        public Criteria andCUserEduStateNotLike(String value) {
            addCriterion("c_user_edu_state not like", value, "cUserEduState");
            return (Criteria) this;
        }

        public Criteria andCUserEduStateIn(List<String> values) {
            addCriterion("c_user_edu_state in", values, "cUserEduState");
            return (Criteria) this;
        }

        public Criteria andCUserEduStateNotIn(List<String> values) {
            addCriterion("c_user_edu_state not in", values, "cUserEduState");
            return (Criteria) this;
        }

        public Criteria andCUserEduStateBetween(String value1, String value2) {
            addCriterion("c_user_edu_state between", value1, value2, "cUserEduState");
            return (Criteria) this;
        }

        public Criteria andCUserEduStateNotBetween(String value1, String value2) {
            addCriterion("c_user_edu_state not between", value1, value2, "cUserEduState");
            return (Criteria) this;
        }

        public Criteria andCUserSchoolNameIsNull() {
            addCriterion("c_user_school_name is null");
            return (Criteria) this;
        }

        public Criteria andCUserSchoolNameIsNotNull() {
            addCriterion("c_user_school_name is not null");
            return (Criteria) this;
        }

        public Criteria andCUserSchoolNameEqualTo(String value) {
            addCriterion("c_user_school_name =", value, "cUserSchoolName");
            return (Criteria) this;
        }

        public Criteria andCUserSchoolNameNotEqualTo(String value) {
            addCriterion("c_user_school_name <>", value, "cUserSchoolName");
            return (Criteria) this;
        }

        public Criteria andCUserSchoolNameGreaterThan(String value) {
            addCriterion("c_user_school_name >", value, "cUserSchoolName");
            return (Criteria) this;
        }

        public Criteria andCUserSchoolNameGreaterThanOrEqualTo(String value) {
            addCriterion("c_user_school_name >=", value, "cUserSchoolName");
            return (Criteria) this;
        }

        public Criteria andCUserSchoolNameLessThan(String value) {
            addCriterion("c_user_school_name <", value, "cUserSchoolName");
            return (Criteria) this;
        }

        public Criteria andCUserSchoolNameLessThanOrEqualTo(String value) {
            addCriterion("c_user_school_name <=", value, "cUserSchoolName");
            return (Criteria) this;
        }

        public Criteria andCUserSchoolNameLike(String value) {
            addCriterion("c_user_school_name like", value, "cUserSchoolName");
            return (Criteria) this;
        }

        public Criteria andCUserSchoolNameNotLike(String value) {
            addCriterion("c_user_school_name not like", value, "cUserSchoolName");
            return (Criteria) this;
        }

        public Criteria andCUserSchoolNameIn(List<String> values) {
            addCriterion("c_user_school_name in", values, "cUserSchoolName");
            return (Criteria) this;
        }

        public Criteria andCUserSchoolNameNotIn(List<String> values) {
            addCriterion("c_user_school_name not in", values, "cUserSchoolName");
            return (Criteria) this;
        }

        public Criteria andCUserSchoolNameBetween(String value1, String value2) {
            addCriterion("c_user_school_name between", value1, value2, "cUserSchoolName");
            return (Criteria) this;
        }

        public Criteria andCUserSchoolNameNotBetween(String value1, String value2) {
            addCriterion("c_user_school_name not between", value1, value2, "cUserSchoolName");
            return (Criteria) this;
        }

        public Criteria andCUserBalanceIsNull() {
            addCriterion("c_user_balance is null");
            return (Criteria) this;
        }

        public Criteria andCUserBalanceIsNotNull() {
            addCriterion("c_user_balance is not null");
            return (Criteria) this;
        }

        public Criteria andCUserBalanceEqualTo(Integer value) {
            addCriterion("c_user_balance =", value, "cUserBalance");
            return (Criteria) this;
        }

        public Criteria andCUserBalanceNotEqualTo(Integer value) {
            addCriterion("c_user_balance <>", value, "cUserBalance");
            return (Criteria) this;
        }

        public Criteria andCUserBalanceGreaterThan(Integer value) {
            addCriterion("c_user_balance >", value, "cUserBalance");
            return (Criteria) this;
        }

        public Criteria andCUserBalanceGreaterThanOrEqualTo(Integer value) {
            addCriterion("c_user_balance >=", value, "cUserBalance");
            return (Criteria) this;
        }

        public Criteria andCUserBalanceLessThan(Integer value) {
            addCriterion("c_user_balance <", value, "cUserBalance");
            return (Criteria) this;
        }

        public Criteria andCUserBalanceLessThanOrEqualTo(Integer value) {
            addCriterion("c_user_balance <=", value, "cUserBalance");
            return (Criteria) this;
        }

        public Criteria andCUserBalanceIn(List<Integer> values) {
            addCriterion("c_user_balance in", values, "cUserBalance");
            return (Criteria) this;
        }

        public Criteria andCUserBalanceNotIn(List<Integer> values) {
            addCriterion("c_user_balance not in", values, "cUserBalance");
            return (Criteria) this;
        }

        public Criteria andCUserBalanceBetween(Integer value1, Integer value2) {
            addCriterion("c_user_balance between", value1, value2, "cUserBalance");
            return (Criteria) this;
        }

        public Criteria andCUserBalanceNotBetween(Integer value1, Integer value2) {
            addCriterion("c_user_balance not between", value1, value2, "cUserBalance");
            return (Criteria) this;
        }

        public Criteria andCUserScoreIsNull() {
            addCriterion("c_user_score is null");
            return (Criteria) this;
        }

        public Criteria andCUserScoreIsNotNull() {
            addCriterion("c_user_score is not null");
            return (Criteria) this;
        }

        public Criteria andCUserScoreEqualTo(Integer value) {
            addCriterion("c_user_score =", value, "cUserScore");
            return (Criteria) this;
        }

        public Criteria andCUserScoreNotEqualTo(Integer value) {
            addCriterion("c_user_score <>", value, "cUserScore");
            return (Criteria) this;
        }

        public Criteria andCUserScoreGreaterThan(Integer value) {
            addCriterion("c_user_score >", value, "cUserScore");
            return (Criteria) this;
        }

        public Criteria andCUserScoreGreaterThanOrEqualTo(Integer value) {
            addCriterion("c_user_score >=", value, "cUserScore");
            return (Criteria) this;
        }

        public Criteria andCUserScoreLessThan(Integer value) {
            addCriterion("c_user_score <", value, "cUserScore");
            return (Criteria) this;
        }

        public Criteria andCUserScoreLessThanOrEqualTo(Integer value) {
            addCriterion("c_user_score <=", value, "cUserScore");
            return (Criteria) this;
        }

        public Criteria andCUserScoreIn(List<Integer> values) {
            addCriterion("c_user_score in", values, "cUserScore");
            return (Criteria) this;
        }

        public Criteria andCUserScoreNotIn(List<Integer> values) {
            addCriterion("c_user_score not in", values, "cUserScore");
            return (Criteria) this;
        }

        public Criteria andCUserScoreBetween(Integer value1, Integer value2) {
            addCriterion("c_user_score between", value1, value2, "cUserScore");
            return (Criteria) this;
        }

        public Criteria andCUserScoreNotBetween(Integer value1, Integer value2) {
            addCriterion("c_user_score not between", value1, value2, "cUserScore");
            return (Criteria) this;
        }

        public Criteria andCUserImgIsNull() {
            addCriterion("c_user_img is null");
            return (Criteria) this;
        }

        public Criteria andCUserImgIsNotNull() {
            addCriterion("c_user_img is not null");
            return (Criteria) this;
        }

        public Criteria andCUserImgEqualTo(String value) {
            addCriterion("c_user_img =", value, "cUserImg");
            return (Criteria) this;
        }

        public Criteria andCUserImgNotEqualTo(String value) {
            addCriterion("c_user_img <>", value, "cUserImg");
            return (Criteria) this;
        }

        public Criteria andCUserImgGreaterThan(String value) {
            addCriterion("c_user_img >", value, "cUserImg");
            return (Criteria) this;
        }

        public Criteria andCUserImgGreaterThanOrEqualTo(String value) {
            addCriterion("c_user_img >=", value, "cUserImg");
            return (Criteria) this;
        }

        public Criteria andCUserImgLessThan(String value) {
            addCriterion("c_user_img <", value, "cUserImg");
            return (Criteria) this;
        }

        public Criteria andCUserImgLessThanOrEqualTo(String value) {
            addCriterion("c_user_img <=", value, "cUserImg");
            return (Criteria) this;
        }

        public Criteria andCUserImgLike(String value) {
            addCriterion("c_user_img like", value, "cUserImg");
            return (Criteria) this;
        }

        public Criteria andCUserImgNotLike(String value) {
            addCriterion("c_user_img not like", value, "cUserImg");
            return (Criteria) this;
        }

        public Criteria andCUserImgIn(List<String> values) {
            addCriterion("c_user_img in", values, "cUserImg");
            return (Criteria) this;
        }

        public Criteria andCUserImgNotIn(List<String> values) {
            addCriterion("c_user_img not in", values, "cUserImg");
            return (Criteria) this;
        }

        public Criteria andCUserImgBetween(String value1, String value2) {
            addCriterion("c_user_img between", value1, value2, "cUserImg");
            return (Criteria) this;
        }

        public Criteria andCUserImgNotBetween(String value1, String value2) {
            addCriterion("c_user_img not between", value1, value2, "cUserImg");
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