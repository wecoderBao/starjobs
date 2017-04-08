package com.starjobs.pojo;

import java.util.ArrayList;
import java.util.List;

public class TWithdrawVerifyExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TWithdrawVerifyExample() {
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

        public Criteria andCVerifyIdIsNull() {
            addCriterion("c_verify_id is null");
            return (Criteria) this;
        }

        public Criteria andCVerifyIdIsNotNull() {
            addCriterion("c_verify_id is not null");
            return (Criteria) this;
        }

        public Criteria andCVerifyIdEqualTo(Integer value) {
            addCriterion("c_verify_id =", value, "cVerifyId");
            return (Criteria) this;
        }

        public Criteria andCVerifyIdNotEqualTo(Integer value) {
            addCriterion("c_verify_id <>", value, "cVerifyId");
            return (Criteria) this;
        }

        public Criteria andCVerifyIdGreaterThan(Integer value) {
            addCriterion("c_verify_id >", value, "cVerifyId");
            return (Criteria) this;
        }

        public Criteria andCVerifyIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("c_verify_id >=", value, "cVerifyId");
            return (Criteria) this;
        }

        public Criteria andCVerifyIdLessThan(Integer value) {
            addCriterion("c_verify_id <", value, "cVerifyId");
            return (Criteria) this;
        }

        public Criteria andCVerifyIdLessThanOrEqualTo(Integer value) {
            addCriterion("c_verify_id <=", value, "cVerifyId");
            return (Criteria) this;
        }

        public Criteria andCVerifyIdIn(List<Integer> values) {
            addCriterion("c_verify_id in", values, "cVerifyId");
            return (Criteria) this;
        }

        public Criteria andCVerifyIdNotIn(List<Integer> values) {
            addCriterion("c_verify_id not in", values, "cVerifyId");
            return (Criteria) this;
        }

        public Criteria andCVerifyIdBetween(Integer value1, Integer value2) {
            addCriterion("c_verify_id between", value1, value2, "cVerifyId");
            return (Criteria) this;
        }

        public Criteria andCVerifyIdNotBetween(Integer value1, Integer value2) {
            addCriterion("c_verify_id not between", value1, value2, "cVerifyId");
            return (Criteria) this;
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

        public Criteria andCWithdrawMoneyIsNull() {
            addCriterion("c_withdraw_money is null");
            return (Criteria) this;
        }

        public Criteria andCWithdrawMoneyIsNotNull() {
            addCriterion("c_withdraw_money is not null");
            return (Criteria) this;
        }

        public Criteria andCWithdrawMoneyEqualTo(Integer value) {
            addCriterion("c_withdraw_money =", value, "cWithdrawMoney");
            return (Criteria) this;
        }

        public Criteria andCWithdrawMoneyNotEqualTo(Integer value) {
            addCriterion("c_withdraw_money <>", value, "cWithdrawMoney");
            return (Criteria) this;
        }

        public Criteria andCWithdrawMoneyGreaterThan(Integer value) {
            addCriterion("c_withdraw_money >", value, "cWithdrawMoney");
            return (Criteria) this;
        }

        public Criteria andCWithdrawMoneyGreaterThanOrEqualTo(Integer value) {
            addCriterion("c_withdraw_money >=", value, "cWithdrawMoney");
            return (Criteria) this;
        }

        public Criteria andCWithdrawMoneyLessThan(Integer value) {
            addCriterion("c_withdraw_money <", value, "cWithdrawMoney");
            return (Criteria) this;
        }

        public Criteria andCWithdrawMoneyLessThanOrEqualTo(Integer value) {
            addCriterion("c_withdraw_money <=", value, "cWithdrawMoney");
            return (Criteria) this;
        }

        public Criteria andCWithdrawMoneyIn(List<Integer> values) {
            addCriterion("c_withdraw_money in", values, "cWithdrawMoney");
            return (Criteria) this;
        }

        public Criteria andCWithdrawMoneyNotIn(List<Integer> values) {
            addCriterion("c_withdraw_money not in", values, "cWithdrawMoney");
            return (Criteria) this;
        }

        public Criteria andCWithdrawMoneyBetween(Integer value1, Integer value2) {
            addCriterion("c_withdraw_money between", value1, value2, "cWithdrawMoney");
            return (Criteria) this;
        }

        public Criteria andCWithdrawMoneyNotBetween(Integer value1, Integer value2) {
            addCriterion("c_withdraw_money not between", value1, value2, "cWithdrawMoney");
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

        public Criteria andCVerifyStateIsNull() {
            addCriterion("c_verify_state is null");
            return (Criteria) this;
        }

        public Criteria andCVerifyStateIsNotNull() {
            addCriterion("c_verify_state is not null");
            return (Criteria) this;
        }

        public Criteria andCVerifyStateEqualTo(String value) {
            addCriterion("c_verify_state =", value, "cVerifyState");
            return (Criteria) this;
        }

        public Criteria andCVerifyStateNotEqualTo(String value) {
            addCriterion("c_verify_state <>", value, "cVerifyState");
            return (Criteria) this;
        }

        public Criteria andCVerifyStateGreaterThan(String value) {
            addCriterion("c_verify_state >", value, "cVerifyState");
            return (Criteria) this;
        }

        public Criteria andCVerifyStateGreaterThanOrEqualTo(String value) {
            addCriterion("c_verify_state >=", value, "cVerifyState");
            return (Criteria) this;
        }

        public Criteria andCVerifyStateLessThan(String value) {
            addCriterion("c_verify_state <", value, "cVerifyState");
            return (Criteria) this;
        }

        public Criteria andCVerifyStateLessThanOrEqualTo(String value) {
            addCriterion("c_verify_state <=", value, "cVerifyState");
            return (Criteria) this;
        }

        public Criteria andCVerifyStateLike(String value) {
            addCriterion("c_verify_state like", value, "cVerifyState");
            return (Criteria) this;
        }

        public Criteria andCVerifyStateNotLike(String value) {
            addCriterion("c_verify_state not like", value, "cVerifyState");
            return (Criteria) this;
        }

        public Criteria andCVerifyStateIn(List<String> values) {
            addCriterion("c_verify_state in", values, "cVerifyState");
            return (Criteria) this;
        }

        public Criteria andCVerifyStateNotIn(List<String> values) {
            addCriterion("c_verify_state not in", values, "cVerifyState");
            return (Criteria) this;
        }

        public Criteria andCVerifyStateBetween(String value1, String value2) {
            addCriterion("c_verify_state between", value1, value2, "cVerifyState");
            return (Criteria) this;
        }

        public Criteria andCVerifyStateNotBetween(String value1, String value2) {
            addCriterion("c_verify_state not between", value1, value2, "cVerifyState");
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