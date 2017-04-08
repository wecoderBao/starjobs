package com.starjobs.pojo;

import java.util.ArrayList;
import java.util.List;

public class TAdminExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TAdminExample() {
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

        public Criteria andCAdminIdIsNull() {
            addCriterion("c_admin_id is null");
            return (Criteria) this;
        }

        public Criteria andCAdminIdIsNotNull() {
            addCriterion("c_admin_id is not null");
            return (Criteria) this;
        }

        public Criteria andCAdminIdEqualTo(Integer value) {
            addCriterion("c_admin_id =", value, "cAdminId");
            return (Criteria) this;
        }

        public Criteria andCAdminIdNotEqualTo(Integer value) {
            addCriterion("c_admin_id <>", value, "cAdminId");
            return (Criteria) this;
        }

        public Criteria andCAdminIdGreaterThan(Integer value) {
            addCriterion("c_admin_id >", value, "cAdminId");
            return (Criteria) this;
        }

        public Criteria andCAdminIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("c_admin_id >=", value, "cAdminId");
            return (Criteria) this;
        }

        public Criteria andCAdminIdLessThan(Integer value) {
            addCriterion("c_admin_id <", value, "cAdminId");
            return (Criteria) this;
        }

        public Criteria andCAdminIdLessThanOrEqualTo(Integer value) {
            addCriterion("c_admin_id <=", value, "cAdminId");
            return (Criteria) this;
        }

        public Criteria andCAdminIdIn(List<Integer> values) {
            addCriterion("c_admin_id in", values, "cAdminId");
            return (Criteria) this;
        }

        public Criteria andCAdminIdNotIn(List<Integer> values) {
            addCriterion("c_admin_id not in", values, "cAdminId");
            return (Criteria) this;
        }

        public Criteria andCAdminIdBetween(Integer value1, Integer value2) {
            addCriterion("c_admin_id between", value1, value2, "cAdminId");
            return (Criteria) this;
        }

        public Criteria andCAdminIdNotBetween(Integer value1, Integer value2) {
            addCriterion("c_admin_id not between", value1, value2, "cAdminId");
            return (Criteria) this;
        }

        public Criteria andCAdminNameIsNull() {
            addCriterion("c_admin_name is null");
            return (Criteria) this;
        }

        public Criteria andCAdminNameIsNotNull() {
            addCriterion("c_admin_name is not null");
            return (Criteria) this;
        }

        public Criteria andCAdminNameEqualTo(String value) {
            addCriterion("c_admin_name =", value, "cAdminName");
            return (Criteria) this;
        }

        public Criteria andCAdminNameNotEqualTo(String value) {
            addCriterion("c_admin_name <>", value, "cAdminName");
            return (Criteria) this;
        }

        public Criteria andCAdminNameGreaterThan(String value) {
            addCriterion("c_admin_name >", value, "cAdminName");
            return (Criteria) this;
        }

        public Criteria andCAdminNameGreaterThanOrEqualTo(String value) {
            addCriterion("c_admin_name >=", value, "cAdminName");
            return (Criteria) this;
        }

        public Criteria andCAdminNameLessThan(String value) {
            addCriterion("c_admin_name <", value, "cAdminName");
            return (Criteria) this;
        }

        public Criteria andCAdminNameLessThanOrEqualTo(String value) {
            addCriterion("c_admin_name <=", value, "cAdminName");
            return (Criteria) this;
        }

        public Criteria andCAdminNameLike(String value) {
            addCriterion("c_admin_name like", value, "cAdminName");
            return (Criteria) this;
        }

        public Criteria andCAdminNameNotLike(String value) {
            addCriterion("c_admin_name not like", value, "cAdminName");
            return (Criteria) this;
        }

        public Criteria andCAdminNameIn(List<String> values) {
            addCriterion("c_admin_name in", values, "cAdminName");
            return (Criteria) this;
        }

        public Criteria andCAdminNameNotIn(List<String> values) {
            addCriterion("c_admin_name not in", values, "cAdminName");
            return (Criteria) this;
        }

        public Criteria andCAdminNameBetween(String value1, String value2) {
            addCriterion("c_admin_name between", value1, value2, "cAdminName");
            return (Criteria) this;
        }

        public Criteria andCAdminNameNotBetween(String value1, String value2) {
            addCriterion("c_admin_name not between", value1, value2, "cAdminName");
            return (Criteria) this;
        }

        public Criteria andCAdminPasswordIsNull() {
            addCriterion("c_admin_password is null");
            return (Criteria) this;
        }

        public Criteria andCAdminPasswordIsNotNull() {
            addCriterion("c_admin_password is not null");
            return (Criteria) this;
        }

        public Criteria andCAdminPasswordEqualTo(String value) {
            addCriterion("c_admin_password =", value, "cAdminPassword");
            return (Criteria) this;
        }

        public Criteria andCAdminPasswordNotEqualTo(String value) {
            addCriterion("c_admin_password <>", value, "cAdminPassword");
            return (Criteria) this;
        }

        public Criteria andCAdminPasswordGreaterThan(String value) {
            addCriterion("c_admin_password >", value, "cAdminPassword");
            return (Criteria) this;
        }

        public Criteria andCAdminPasswordGreaterThanOrEqualTo(String value) {
            addCriterion("c_admin_password >=", value, "cAdminPassword");
            return (Criteria) this;
        }

        public Criteria andCAdminPasswordLessThan(String value) {
            addCriterion("c_admin_password <", value, "cAdminPassword");
            return (Criteria) this;
        }

        public Criteria andCAdminPasswordLessThanOrEqualTo(String value) {
            addCriterion("c_admin_password <=", value, "cAdminPassword");
            return (Criteria) this;
        }

        public Criteria andCAdminPasswordLike(String value) {
            addCriterion("c_admin_password like", value, "cAdminPassword");
            return (Criteria) this;
        }

        public Criteria andCAdminPasswordNotLike(String value) {
            addCriterion("c_admin_password not like", value, "cAdminPassword");
            return (Criteria) this;
        }

        public Criteria andCAdminPasswordIn(List<String> values) {
            addCriterion("c_admin_password in", values, "cAdminPassword");
            return (Criteria) this;
        }

        public Criteria andCAdminPasswordNotIn(List<String> values) {
            addCriterion("c_admin_password not in", values, "cAdminPassword");
            return (Criteria) this;
        }

        public Criteria andCAdminPasswordBetween(String value1, String value2) {
            addCriterion("c_admin_password between", value1, value2, "cAdminPassword");
            return (Criteria) this;
        }

        public Criteria andCAdminPasswordNotBetween(String value1, String value2) {
            addCriterion("c_admin_password not between", value1, value2, "cAdminPassword");
            return (Criteria) this;
        }

        public Criteria andCAdminDescIsNull() {
            addCriterion("c_admin_desc is null");
            return (Criteria) this;
        }

        public Criteria andCAdminDescIsNotNull() {
            addCriterion("c_admin_desc is not null");
            return (Criteria) this;
        }

        public Criteria andCAdminDescEqualTo(String value) {
            addCriterion("c_admin_desc =", value, "cAdminDesc");
            return (Criteria) this;
        }

        public Criteria andCAdminDescNotEqualTo(String value) {
            addCriterion("c_admin_desc <>", value, "cAdminDesc");
            return (Criteria) this;
        }

        public Criteria andCAdminDescGreaterThan(String value) {
            addCriterion("c_admin_desc >", value, "cAdminDesc");
            return (Criteria) this;
        }

        public Criteria andCAdminDescGreaterThanOrEqualTo(String value) {
            addCriterion("c_admin_desc >=", value, "cAdminDesc");
            return (Criteria) this;
        }

        public Criteria andCAdminDescLessThan(String value) {
            addCriterion("c_admin_desc <", value, "cAdminDesc");
            return (Criteria) this;
        }

        public Criteria andCAdminDescLessThanOrEqualTo(String value) {
            addCriterion("c_admin_desc <=", value, "cAdminDesc");
            return (Criteria) this;
        }

        public Criteria andCAdminDescLike(String value) {
            addCriterion("c_admin_desc like", value, "cAdminDesc");
            return (Criteria) this;
        }

        public Criteria andCAdminDescNotLike(String value) {
            addCriterion("c_admin_desc not like", value, "cAdminDesc");
            return (Criteria) this;
        }

        public Criteria andCAdminDescIn(List<String> values) {
            addCriterion("c_admin_desc in", values, "cAdminDesc");
            return (Criteria) this;
        }

        public Criteria andCAdminDescNotIn(List<String> values) {
            addCriterion("c_admin_desc not in", values, "cAdminDesc");
            return (Criteria) this;
        }

        public Criteria andCAdminDescBetween(String value1, String value2) {
            addCriterion("c_admin_desc between", value1, value2, "cAdminDesc");
            return (Criteria) this;
        }

        public Criteria andCAdminDescNotBetween(String value1, String value2) {
            addCriterion("c_admin_desc not between", value1, value2, "cAdminDesc");
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