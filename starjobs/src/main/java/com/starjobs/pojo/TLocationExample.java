package com.starjobs.pojo;

import java.util.ArrayList;
import java.util.List;

public class TLocationExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TLocationExample() {
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

        public Criteria andCLocationIdIsNull() {
            addCriterion("c_location_id is null");
            return (Criteria) this;
        }

        public Criteria andCLocationIdIsNotNull() {
            addCriterion("c_location_id is not null");
            return (Criteria) this;
        }

        public Criteria andCLocationIdEqualTo(Integer value) {
            addCriterion("c_location_id =", value, "cLocationId");
            return (Criteria) this;
        }

        public Criteria andCLocationIdNotEqualTo(Integer value) {
            addCriterion("c_location_id <>", value, "cLocationId");
            return (Criteria) this;
        }

        public Criteria andCLocationIdGreaterThan(Integer value) {
            addCriterion("c_location_id >", value, "cLocationId");
            return (Criteria) this;
        }

        public Criteria andCLocationIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("c_location_id >=", value, "cLocationId");
            return (Criteria) this;
        }

        public Criteria andCLocationIdLessThan(Integer value) {
            addCriterion("c_location_id <", value, "cLocationId");
            return (Criteria) this;
        }

        public Criteria andCLocationIdLessThanOrEqualTo(Integer value) {
            addCriterion("c_location_id <=", value, "cLocationId");
            return (Criteria) this;
        }

        public Criteria andCLocationIdIn(List<Integer> values) {
            addCriterion("c_location_id in", values, "cLocationId");
            return (Criteria) this;
        }

        public Criteria andCLocationIdNotIn(List<Integer> values) {
            addCriterion("c_location_id not in", values, "cLocationId");
            return (Criteria) this;
        }

        public Criteria andCLocationIdBetween(Integer value1, Integer value2) {
            addCriterion("c_location_id between", value1, value2, "cLocationId");
            return (Criteria) this;
        }

        public Criteria andCLocationIdNotBetween(Integer value1, Integer value2) {
            addCriterion("c_location_id not between", value1, value2, "cLocationId");
            return (Criteria) this;
        }

        public Criteria andCLocationLongitudeIsNull() {
            addCriterion("c_location_longitude is null");
            return (Criteria) this;
        }

        public Criteria andCLocationLongitudeIsNotNull() {
            addCriterion("c_location_longitude is not null");
            return (Criteria) this;
        }

        public Criteria andCLocationLongitudeEqualTo(String value) {
            addCriterion("c_location_longitude =", value, "cLocationLongitude");
            return (Criteria) this;
        }

        public Criteria andCLocationLongitudeNotEqualTo(String value) {
            addCriterion("c_location_longitude <>", value, "cLocationLongitude");
            return (Criteria) this;
        }

        public Criteria andCLocationLongitudeGreaterThan(String value) {
            addCriterion("c_location_longitude >", value, "cLocationLongitude");
            return (Criteria) this;
        }

        public Criteria andCLocationLongitudeGreaterThanOrEqualTo(String value) {
            addCriterion("c_location_longitude >=", value, "cLocationLongitude");
            return (Criteria) this;
        }

        public Criteria andCLocationLongitudeLessThan(String value) {
            addCriterion("c_location_longitude <", value, "cLocationLongitude");
            return (Criteria) this;
        }

        public Criteria andCLocationLongitudeLessThanOrEqualTo(String value) {
            addCriterion("c_location_longitude <=", value, "cLocationLongitude");
            return (Criteria) this;
        }

        public Criteria andCLocationLongitudeLike(String value) {
            addCriterion("c_location_longitude like", value, "cLocationLongitude");
            return (Criteria) this;
        }

        public Criteria andCLocationLongitudeNotLike(String value) {
            addCriterion("c_location_longitude not like", value, "cLocationLongitude");
            return (Criteria) this;
        }

        public Criteria andCLocationLongitudeIn(List<String> values) {
            addCriterion("c_location_longitude in", values, "cLocationLongitude");
            return (Criteria) this;
        }

        public Criteria andCLocationLongitudeNotIn(List<String> values) {
            addCriterion("c_location_longitude not in", values, "cLocationLongitude");
            return (Criteria) this;
        }

        public Criteria andCLocationLongitudeBetween(String value1, String value2) {
            addCriterion("c_location_longitude between", value1, value2, "cLocationLongitude");
            return (Criteria) this;
        }

        public Criteria andCLocationLongitudeNotBetween(String value1, String value2) {
            addCriterion("c_location_longitude not between", value1, value2, "cLocationLongitude");
            return (Criteria) this;
        }

        public Criteria andCLocationLatitudeIsNull() {
            addCriterion("c_location_latitude is null");
            return (Criteria) this;
        }

        public Criteria andCLocationLatitudeIsNotNull() {
            addCriterion("c_location_latitude is not null");
            return (Criteria) this;
        }

        public Criteria andCLocationLatitudeEqualTo(String value) {
            addCriterion("c_location_latitude =", value, "cLocationLatitude");
            return (Criteria) this;
        }

        public Criteria andCLocationLatitudeNotEqualTo(String value) {
            addCriterion("c_location_latitude <>", value, "cLocationLatitude");
            return (Criteria) this;
        }

        public Criteria andCLocationLatitudeGreaterThan(String value) {
            addCriterion("c_location_latitude >", value, "cLocationLatitude");
            return (Criteria) this;
        }

        public Criteria andCLocationLatitudeGreaterThanOrEqualTo(String value) {
            addCriterion("c_location_latitude >=", value, "cLocationLatitude");
            return (Criteria) this;
        }

        public Criteria andCLocationLatitudeLessThan(String value) {
            addCriterion("c_location_latitude <", value, "cLocationLatitude");
            return (Criteria) this;
        }

        public Criteria andCLocationLatitudeLessThanOrEqualTo(String value) {
            addCriterion("c_location_latitude <=", value, "cLocationLatitude");
            return (Criteria) this;
        }

        public Criteria andCLocationLatitudeLike(String value) {
            addCriterion("c_location_latitude like", value, "cLocationLatitude");
            return (Criteria) this;
        }

        public Criteria andCLocationLatitudeNotLike(String value) {
            addCriterion("c_location_latitude not like", value, "cLocationLatitude");
            return (Criteria) this;
        }

        public Criteria andCLocationLatitudeIn(List<String> values) {
            addCriterion("c_location_latitude in", values, "cLocationLatitude");
            return (Criteria) this;
        }

        public Criteria andCLocationLatitudeNotIn(List<String> values) {
            addCriterion("c_location_latitude not in", values, "cLocationLatitude");
            return (Criteria) this;
        }

        public Criteria andCLocationLatitudeBetween(String value1, String value2) {
            addCriterion("c_location_latitude between", value1, value2, "cLocationLatitude");
            return (Criteria) this;
        }

        public Criteria andCLocationLatitudeNotBetween(String value1, String value2) {
            addCriterion("c_location_latitude not between", value1, value2, "cLocationLatitude");
            return (Criteria) this;
        }

        public Criteria andCLocationNameIsNull() {
            addCriterion("c_location_name is null");
            return (Criteria) this;
        }

        public Criteria andCLocationNameIsNotNull() {
            addCriterion("c_location_name is not null");
            return (Criteria) this;
        }

        public Criteria andCLocationNameEqualTo(String value) {
            addCriterion("c_location_name =", value, "cLocationName");
            return (Criteria) this;
        }

        public Criteria andCLocationNameNotEqualTo(String value) {
            addCriterion("c_location_name <>", value, "cLocationName");
            return (Criteria) this;
        }

        public Criteria andCLocationNameGreaterThan(String value) {
            addCriterion("c_location_name >", value, "cLocationName");
            return (Criteria) this;
        }

        public Criteria andCLocationNameGreaterThanOrEqualTo(String value) {
            addCriterion("c_location_name >=", value, "cLocationName");
            return (Criteria) this;
        }

        public Criteria andCLocationNameLessThan(String value) {
            addCriterion("c_location_name <", value, "cLocationName");
            return (Criteria) this;
        }

        public Criteria andCLocationNameLessThanOrEqualTo(String value) {
            addCriterion("c_location_name <=", value, "cLocationName");
            return (Criteria) this;
        }

        public Criteria andCLocationNameLike(String value) {
            addCriterion("c_location_name like", value, "cLocationName");
            return (Criteria) this;
        }

        public Criteria andCLocationNameNotLike(String value) {
            addCriterion("c_location_name not like", value, "cLocationName");
            return (Criteria) this;
        }

        public Criteria andCLocationNameIn(List<String> values) {
            addCriterion("c_location_name in", values, "cLocationName");
            return (Criteria) this;
        }

        public Criteria andCLocationNameNotIn(List<String> values) {
            addCriterion("c_location_name not in", values, "cLocationName");
            return (Criteria) this;
        }

        public Criteria andCLocationNameBetween(String value1, String value2) {
            addCriterion("c_location_name between", value1, value2, "cLocationName");
            return (Criteria) this;
        }

        public Criteria andCLocationNameNotBetween(String value1, String value2) {
            addCriterion("c_location_name not between", value1, value2, "cLocationName");
            return (Criteria) this;
        }

        public Criteria andCLocationTypeIsNull() {
            addCriterion("c_location_type is null");
            return (Criteria) this;
        }

        public Criteria andCLocationTypeIsNotNull() {
            addCriterion("c_location_type is not null");
            return (Criteria) this;
        }

        public Criteria andCLocationTypeEqualTo(String value) {
            addCriterion("c_location_type =", value, "cLocationType");
            return (Criteria) this;
        }

        public Criteria andCLocationTypeNotEqualTo(String value) {
            addCriterion("c_location_type <>", value, "cLocationType");
            return (Criteria) this;
        }

        public Criteria andCLocationTypeGreaterThan(String value) {
            addCriterion("c_location_type >", value, "cLocationType");
            return (Criteria) this;
        }

        public Criteria andCLocationTypeGreaterThanOrEqualTo(String value) {
            addCriterion("c_location_type >=", value, "cLocationType");
            return (Criteria) this;
        }

        public Criteria andCLocationTypeLessThan(String value) {
            addCriterion("c_location_type <", value, "cLocationType");
            return (Criteria) this;
        }

        public Criteria andCLocationTypeLessThanOrEqualTo(String value) {
            addCriterion("c_location_type <=", value, "cLocationType");
            return (Criteria) this;
        }

        public Criteria andCLocationTypeLike(String value) {
            addCriterion("c_location_type like", value, "cLocationType");
            return (Criteria) this;
        }

        public Criteria andCLocationTypeNotLike(String value) {
            addCriterion("c_location_type not like", value, "cLocationType");
            return (Criteria) this;
        }

        public Criteria andCLocationTypeIn(List<String> values) {
            addCriterion("c_location_type in", values, "cLocationType");
            return (Criteria) this;
        }

        public Criteria andCLocationTypeNotIn(List<String> values) {
            addCriterion("c_location_type not in", values, "cLocationType");
            return (Criteria) this;
        }

        public Criteria andCLocationTypeBetween(String value1, String value2) {
            addCriterion("c_location_type between", value1, value2, "cLocationType");
            return (Criteria) this;
        }

        public Criteria andCLocationTypeNotBetween(String value1, String value2) {
            addCriterion("c_location_type not between", value1, value2, "cLocationType");
            return (Criteria) this;
        }

        public Criteria andCLocationDescIsNull() {
            addCriterion("c_location_desc is null");
            return (Criteria) this;
        }

        public Criteria andCLocationDescIsNotNull() {
            addCriterion("c_location_desc is not null");
            return (Criteria) this;
        }

        public Criteria andCLocationDescEqualTo(String value) {
            addCriterion("c_location_desc =", value, "cLocationDesc");
            return (Criteria) this;
        }

        public Criteria andCLocationDescNotEqualTo(String value) {
            addCriterion("c_location_desc <>", value, "cLocationDesc");
            return (Criteria) this;
        }

        public Criteria andCLocationDescGreaterThan(String value) {
            addCriterion("c_location_desc >", value, "cLocationDesc");
            return (Criteria) this;
        }

        public Criteria andCLocationDescGreaterThanOrEqualTo(String value) {
            addCriterion("c_location_desc >=", value, "cLocationDesc");
            return (Criteria) this;
        }

        public Criteria andCLocationDescLessThan(String value) {
            addCriterion("c_location_desc <", value, "cLocationDesc");
            return (Criteria) this;
        }

        public Criteria andCLocationDescLessThanOrEqualTo(String value) {
            addCriterion("c_location_desc <=", value, "cLocationDesc");
            return (Criteria) this;
        }

        public Criteria andCLocationDescLike(String value) {
            addCriterion("c_location_desc like", value, "cLocationDesc");
            return (Criteria) this;
        }

        public Criteria andCLocationDescNotLike(String value) {
            addCriterion("c_location_desc not like", value, "cLocationDesc");
            return (Criteria) this;
        }

        public Criteria andCLocationDescIn(List<String> values) {
            addCriterion("c_location_desc in", values, "cLocationDesc");
            return (Criteria) this;
        }

        public Criteria andCLocationDescNotIn(List<String> values) {
            addCriterion("c_location_desc not in", values, "cLocationDesc");
            return (Criteria) this;
        }

        public Criteria andCLocationDescBetween(String value1, String value2) {
            addCriterion("c_location_desc between", value1, value2, "cLocationDesc");
            return (Criteria) this;
        }

        public Criteria andCLocationDescNotBetween(String value1, String value2) {
            addCriterion("c_location_desc not between", value1, value2, "cLocationDesc");
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