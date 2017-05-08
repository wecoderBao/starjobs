package com.starjobs.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TUserRechargeExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TUserRechargeExample() {
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

        public Criteria andCUserRechargeIdIsNull() {
            addCriterion("c_user_recharge_id is null");
            return (Criteria) this;
        }

        public Criteria andCUserRechargeIdIsNotNull() {
            addCriterion("c_user_recharge_id is not null");
            return (Criteria) this;
        }

        public Criteria andCUserRechargeIdEqualTo(Integer value) {
            addCriterion("c_user_recharge_id =", value, "cUserRechargeId");
            return (Criteria) this;
        }

        public Criteria andCUserRechargeIdNotEqualTo(Integer value) {
            addCriterion("c_user_recharge_id <>", value, "cUserRechargeId");
            return (Criteria) this;
        }

        public Criteria andCUserRechargeIdGreaterThan(Integer value) {
            addCriterion("c_user_recharge_id >", value, "cUserRechargeId");
            return (Criteria) this;
        }

        public Criteria andCUserRechargeIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("c_user_recharge_id >=", value, "cUserRechargeId");
            return (Criteria) this;
        }

        public Criteria andCUserRechargeIdLessThan(Integer value) {
            addCriterion("c_user_recharge_id <", value, "cUserRechargeId");
            return (Criteria) this;
        }

        public Criteria andCUserRechargeIdLessThanOrEqualTo(Integer value) {
            addCriterion("c_user_recharge_id <=", value, "cUserRechargeId");
            return (Criteria) this;
        }

        public Criteria andCUserRechargeIdIn(List<Integer> values) {
            addCriterion("c_user_recharge_id in", values, "cUserRechargeId");
            return (Criteria) this;
        }

        public Criteria andCUserRechargeIdNotIn(List<Integer> values) {
            addCriterion("c_user_recharge_id not in", values, "cUserRechargeId");
            return (Criteria) this;
        }

        public Criteria andCUserRechargeIdBetween(Integer value1, Integer value2) {
            addCriterion("c_user_recharge_id between", value1, value2, "cUserRechargeId");
            return (Criteria) this;
        }

        public Criteria andCUserRechargeIdNotBetween(Integer value1, Integer value2) {
            addCriterion("c_user_recharge_id not between", value1, value2, "cUserRechargeId");
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

        public Criteria andCUserRechargeMoneyIsNull() {
            addCriterion("c_user_recharge_money is null");
            return (Criteria) this;
        }

        public Criteria andCUserRechargeMoneyIsNotNull() {
            addCriterion("c_user_recharge_money is not null");
            return (Criteria) this;
        }

        public Criteria andCUserRechargeMoneyEqualTo(Integer value) {
            addCriterion("c_user_recharge_money =", value, "cUserRechargeMoney");
            return (Criteria) this;
        }

        public Criteria andCUserRechargeMoneyNotEqualTo(Integer value) {
            addCriterion("c_user_recharge_money <>", value, "cUserRechargeMoney");
            return (Criteria) this;
        }

        public Criteria andCUserRechargeMoneyGreaterThan(Integer value) {
            addCriterion("c_user_recharge_money >", value, "cUserRechargeMoney");
            return (Criteria) this;
        }

        public Criteria andCUserRechargeMoneyGreaterThanOrEqualTo(Integer value) {
            addCriterion("c_user_recharge_money >=", value, "cUserRechargeMoney");
            return (Criteria) this;
        }

        public Criteria andCUserRechargeMoneyLessThan(Integer value) {
            addCriterion("c_user_recharge_money <", value, "cUserRechargeMoney");
            return (Criteria) this;
        }

        public Criteria andCUserRechargeMoneyLessThanOrEqualTo(Integer value) {
            addCriterion("c_user_recharge_money <=", value, "cUserRechargeMoney");
            return (Criteria) this;
        }

        public Criteria andCUserRechargeMoneyIn(List<Integer> values) {
            addCriterion("c_user_recharge_money in", values, "cUserRechargeMoney");
            return (Criteria) this;
        }

        public Criteria andCUserRechargeMoneyNotIn(List<Integer> values) {
            addCriterion("c_user_recharge_money not in", values, "cUserRechargeMoney");
            return (Criteria) this;
        }

        public Criteria andCUserRechargeMoneyBetween(Integer value1, Integer value2) {
            addCriterion("c_user_recharge_money between", value1, value2, "cUserRechargeMoney");
            return (Criteria) this;
        }

        public Criteria andCUserRechargeMoneyNotBetween(Integer value1, Integer value2) {
            addCriterion("c_user_recharge_money not between", value1, value2, "cUserRechargeMoney");
            return (Criteria) this;
        }

        public Criteria andCUserRechargeDateIsNull() {
            addCriterion("c_user_recharge_date is null");
            return (Criteria) this;
        }

        public Criteria andCUserRechargeDateIsNotNull() {
            addCriterion("c_user_recharge_date is not null");
            return (Criteria) this;
        }

        public Criteria andCUserRechargeDateEqualTo(Date value) {
            addCriterion("c_user_recharge_date =", value, "cUserRechargeDate");
            return (Criteria) this;
        }

        public Criteria andCUserRechargeDateNotEqualTo(Date value) {
            addCriterion("c_user_recharge_date <>", value, "cUserRechargeDate");
            return (Criteria) this;
        }

        public Criteria andCUserRechargeDateGreaterThan(Date value) {
            addCriterion("c_user_recharge_date >", value, "cUserRechargeDate");
            return (Criteria) this;
        }

        public Criteria andCUserRechargeDateGreaterThanOrEqualTo(Date value) {
            addCriterion("c_user_recharge_date >=", value, "cUserRechargeDate");
            return (Criteria) this;
        }

        public Criteria andCUserRechargeDateLessThan(Date value) {
            addCriterion("c_user_recharge_date <", value, "cUserRechargeDate");
            return (Criteria) this;
        }

        public Criteria andCUserRechargeDateLessThanOrEqualTo(Date value) {
            addCriterion("c_user_recharge_date <=", value, "cUserRechargeDate");
            return (Criteria) this;
        }

        public Criteria andCUserRechargeDateIn(List<Date> values) {
            addCriterion("c_user_recharge_date in", values, "cUserRechargeDate");
            return (Criteria) this;
        }

        public Criteria andCUserRechargeDateNotIn(List<Date> values) {
            addCriterion("c_user_recharge_date not in", values, "cUserRechargeDate");
            return (Criteria) this;
        }

        public Criteria andCUserRechargeDateBetween(Date value1, Date value2) {
            addCriterion("c_user_recharge_date between", value1, value2, "cUserRechargeDate");
            return (Criteria) this;
        }

        public Criteria andCUserRechargeDateNotBetween(Date value1, Date value2) {
            addCriterion("c_user_recharge_date not between", value1, value2, "cUserRechargeDate");
            return (Criteria) this;
        }

        public Criteria andCUserBalanceAfterIsNull() {
            addCriterion("c_user_balance_after is null");
            return (Criteria) this;
        }

        public Criteria andCUserBalanceAfterIsNotNull() {
            addCriterion("c_user_balance_after is not null");
            return (Criteria) this;
        }

        public Criteria andCUserBalanceAfterEqualTo(Integer value) {
            addCriterion("c_user_balance_after =", value, "cUserBalanceAfter");
            return (Criteria) this;
        }

        public Criteria andCUserBalanceAfterNotEqualTo(Integer value) {
            addCriterion("c_user_balance_after <>", value, "cUserBalanceAfter");
            return (Criteria) this;
        }

        public Criteria andCUserBalanceAfterGreaterThan(Integer value) {
            addCriterion("c_user_balance_after >", value, "cUserBalanceAfter");
            return (Criteria) this;
        }

        public Criteria andCUserBalanceAfterGreaterThanOrEqualTo(Integer value) {
            addCriterion("c_user_balance_after >=", value, "cUserBalanceAfter");
            return (Criteria) this;
        }

        public Criteria andCUserBalanceAfterLessThan(Integer value) {
            addCriterion("c_user_balance_after <", value, "cUserBalanceAfter");
            return (Criteria) this;
        }

        public Criteria andCUserBalanceAfterLessThanOrEqualTo(Integer value) {
            addCriterion("c_user_balance_after <=", value, "cUserBalanceAfter");
            return (Criteria) this;
        }

        public Criteria andCUserBalanceAfterIn(List<Integer> values) {
            addCriterion("c_user_balance_after in", values, "cUserBalanceAfter");
            return (Criteria) this;
        }

        public Criteria andCUserBalanceAfterNotIn(List<Integer> values) {
            addCriterion("c_user_balance_after not in", values, "cUserBalanceAfter");
            return (Criteria) this;
        }

        public Criteria andCUserBalanceAfterBetween(Integer value1, Integer value2) {
            addCriterion("c_user_balance_after between", value1, value2, "cUserBalanceAfter");
            return (Criteria) this;
        }

        public Criteria andCUserBalanceAfterNotBetween(Integer value1, Integer value2) {
            addCriterion("c_user_balance_after not between", value1, value2, "cUserBalanceAfter");
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