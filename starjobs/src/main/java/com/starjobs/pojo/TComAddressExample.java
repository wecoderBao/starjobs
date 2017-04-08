package com.starjobs.pojo;

import java.util.ArrayList;
import java.util.List;

public class TComAddressExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TComAddressExample() {
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

        public Criteria andCProvinceIsNull() {
            addCriterion("c_province is null");
            return (Criteria) this;
        }

        public Criteria andCProvinceIsNotNull() {
            addCriterion("c_province is not null");
            return (Criteria) this;
        }

        public Criteria andCProvinceEqualTo(String value) {
            addCriterion("c_province =", value, "cProvince");
            return (Criteria) this;
        }

        public Criteria andCProvinceNotEqualTo(String value) {
            addCriterion("c_province <>", value, "cProvince");
            return (Criteria) this;
        }

        public Criteria andCProvinceGreaterThan(String value) {
            addCriterion("c_province >", value, "cProvince");
            return (Criteria) this;
        }

        public Criteria andCProvinceGreaterThanOrEqualTo(String value) {
            addCriterion("c_province >=", value, "cProvince");
            return (Criteria) this;
        }

        public Criteria andCProvinceLessThan(String value) {
            addCriterion("c_province <", value, "cProvince");
            return (Criteria) this;
        }

        public Criteria andCProvinceLessThanOrEqualTo(String value) {
            addCriterion("c_province <=", value, "cProvince");
            return (Criteria) this;
        }

        public Criteria andCProvinceLike(String value) {
            addCriterion("c_province like", value, "cProvince");
            return (Criteria) this;
        }

        public Criteria andCProvinceNotLike(String value) {
            addCriterion("c_province not like", value, "cProvince");
            return (Criteria) this;
        }

        public Criteria andCProvinceIn(List<String> values) {
            addCriterion("c_province in", values, "cProvince");
            return (Criteria) this;
        }

        public Criteria andCProvinceNotIn(List<String> values) {
            addCriterion("c_province not in", values, "cProvince");
            return (Criteria) this;
        }

        public Criteria andCProvinceBetween(String value1, String value2) {
            addCriterion("c_province between", value1, value2, "cProvince");
            return (Criteria) this;
        }

        public Criteria andCProvinceNotBetween(String value1, String value2) {
            addCriterion("c_province not between", value1, value2, "cProvince");
            return (Criteria) this;
        }

        public Criteria andCCityIsNull() {
            addCriterion("c_city is null");
            return (Criteria) this;
        }

        public Criteria andCCityIsNotNull() {
            addCriterion("c_city is not null");
            return (Criteria) this;
        }

        public Criteria andCCityEqualTo(String value) {
            addCriterion("c_city =", value, "cCity");
            return (Criteria) this;
        }

        public Criteria andCCityNotEqualTo(String value) {
            addCriterion("c_city <>", value, "cCity");
            return (Criteria) this;
        }

        public Criteria andCCityGreaterThan(String value) {
            addCriterion("c_city >", value, "cCity");
            return (Criteria) this;
        }

        public Criteria andCCityGreaterThanOrEqualTo(String value) {
            addCriterion("c_city >=", value, "cCity");
            return (Criteria) this;
        }

        public Criteria andCCityLessThan(String value) {
            addCriterion("c_city <", value, "cCity");
            return (Criteria) this;
        }

        public Criteria andCCityLessThanOrEqualTo(String value) {
            addCriterion("c_city <=", value, "cCity");
            return (Criteria) this;
        }

        public Criteria andCCityLike(String value) {
            addCriterion("c_city like", value, "cCity");
            return (Criteria) this;
        }

        public Criteria andCCityNotLike(String value) {
            addCriterion("c_city not like", value, "cCity");
            return (Criteria) this;
        }

        public Criteria andCCityIn(List<String> values) {
            addCriterion("c_city in", values, "cCity");
            return (Criteria) this;
        }

        public Criteria andCCityNotIn(List<String> values) {
            addCriterion("c_city not in", values, "cCity");
            return (Criteria) this;
        }

        public Criteria andCCityBetween(String value1, String value2) {
            addCriterion("c_city between", value1, value2, "cCity");
            return (Criteria) this;
        }

        public Criteria andCCityNotBetween(String value1, String value2) {
            addCriterion("c_city not between", value1, value2, "cCity");
            return (Criteria) this;
        }

        public Criteria andCTownIsNull() {
            addCriterion("c_town is null");
            return (Criteria) this;
        }

        public Criteria andCTownIsNotNull() {
            addCriterion("c_town is not null");
            return (Criteria) this;
        }

        public Criteria andCTownEqualTo(String value) {
            addCriterion("c_town =", value, "cTown");
            return (Criteria) this;
        }

        public Criteria andCTownNotEqualTo(String value) {
            addCriterion("c_town <>", value, "cTown");
            return (Criteria) this;
        }

        public Criteria andCTownGreaterThan(String value) {
            addCriterion("c_town >", value, "cTown");
            return (Criteria) this;
        }

        public Criteria andCTownGreaterThanOrEqualTo(String value) {
            addCriterion("c_town >=", value, "cTown");
            return (Criteria) this;
        }

        public Criteria andCTownLessThan(String value) {
            addCriterion("c_town <", value, "cTown");
            return (Criteria) this;
        }

        public Criteria andCTownLessThanOrEqualTo(String value) {
            addCriterion("c_town <=", value, "cTown");
            return (Criteria) this;
        }

        public Criteria andCTownLike(String value) {
            addCriterion("c_town like", value, "cTown");
            return (Criteria) this;
        }

        public Criteria andCTownNotLike(String value) {
            addCriterion("c_town not like", value, "cTown");
            return (Criteria) this;
        }

        public Criteria andCTownIn(List<String> values) {
            addCriterion("c_town in", values, "cTown");
            return (Criteria) this;
        }

        public Criteria andCTownNotIn(List<String> values) {
            addCriterion("c_town not in", values, "cTown");
            return (Criteria) this;
        }

        public Criteria andCTownBetween(String value1, String value2) {
            addCriterion("c_town between", value1, value2, "cTown");
            return (Criteria) this;
        }

        public Criteria andCTownNotBetween(String value1, String value2) {
            addCriterion("c_town not between", value1, value2, "cTown");
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