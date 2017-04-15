package com.starjobs.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TJobInfoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TJobInfoExample() {
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

        public Criteria andCJobIdIsNull() {
            addCriterion("c_job_id is null");
            return (Criteria) this;
        }

        public Criteria andCJobIdIsNotNull() {
            addCriterion("c_job_id is not null");
            return (Criteria) this;
        }

        public Criteria andCJobIdEqualTo(Integer value) {
            addCriterion("c_job_id =", value, "cJobId");
            return (Criteria) this;
        }

        public Criteria andCJobIdNotEqualTo(Integer value) {
            addCriterion("c_job_id <>", value, "cJobId");
            return (Criteria) this;
        }

        public Criteria andCJobIdGreaterThan(Integer value) {
            addCriterion("c_job_id >", value, "cJobId");
            return (Criteria) this;
        }

        public Criteria andCJobIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("c_job_id >=", value, "cJobId");
            return (Criteria) this;
        }

        public Criteria andCJobIdLessThan(Integer value) {
            addCriterion("c_job_id <", value, "cJobId");
            return (Criteria) this;
        }

        public Criteria andCJobIdLessThanOrEqualTo(Integer value) {
            addCriterion("c_job_id <=", value, "cJobId");
            return (Criteria) this;
        }

        public Criteria andCJobIdIn(List<Integer> values) {
            addCriterion("c_job_id in", values, "cJobId");
            return (Criteria) this;
        }

        public Criteria andCJobIdNotIn(List<Integer> values) {
            addCriterion("c_job_id not in", values, "cJobId");
            return (Criteria) this;
        }

        public Criteria andCJobIdBetween(Integer value1, Integer value2) {
            addCriterion("c_job_id between", value1, value2, "cJobId");
            return (Criteria) this;
        }

        public Criteria andCJobIdNotBetween(Integer value1, Integer value2) {
            addCriterion("c_job_id not between", value1, value2, "cJobId");
            return (Criteria) this;
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

        public Criteria andCJobCityIsNull() {
            addCriterion("c_job_city is null");
            return (Criteria) this;
        }

        public Criteria andCJobCityIsNotNull() {
            addCriterion("c_job_city is not null");
            return (Criteria) this;
        }

        public Criteria andCJobCityEqualTo(String value) {
            addCriterion("c_job_city =", value, "cJobCity");
            return (Criteria) this;
        }

        public Criteria andCJobCityNotEqualTo(String value) {
            addCriterion("c_job_city <>", value, "cJobCity");
            return (Criteria) this;
        }

        public Criteria andCJobCityGreaterThan(String value) {
            addCriterion("c_job_city >", value, "cJobCity");
            return (Criteria) this;
        }

        public Criteria andCJobCityGreaterThanOrEqualTo(String value) {
            addCriterion("c_job_city >=", value, "cJobCity");
            return (Criteria) this;
        }

        public Criteria andCJobCityLessThan(String value) {
            addCriterion("c_job_city <", value, "cJobCity");
            return (Criteria) this;
        }

        public Criteria andCJobCityLessThanOrEqualTo(String value) {
            addCriterion("c_job_city <=", value, "cJobCity");
            return (Criteria) this;
        }

        public Criteria andCJobCityLike(String value) {
            addCriterion("c_job_city like", value, "cJobCity");
            return (Criteria) this;
        }

        public Criteria andCJobCityNotLike(String value) {
            addCriterion("c_job_city not like", value, "cJobCity");
            return (Criteria) this;
        }

        public Criteria andCJobCityIn(List<String> values) {
            addCriterion("c_job_city in", values, "cJobCity");
            return (Criteria) this;
        }

        public Criteria andCJobCityNotIn(List<String> values) {
            addCriterion("c_job_city not in", values, "cJobCity");
            return (Criteria) this;
        }

        public Criteria andCJobCityBetween(String value1, String value2) {
            addCriterion("c_job_city between", value1, value2, "cJobCity");
            return (Criteria) this;
        }

        public Criteria andCJobCityNotBetween(String value1, String value2) {
            addCriterion("c_job_city not between", value1, value2, "cJobCity");
            return (Criteria) this;
        }

        public Criteria andCJobAreaIsNull() {
            addCriterion("c_job_area is null");
            return (Criteria) this;
        }

        public Criteria andCJobAreaIsNotNull() {
            addCriterion("c_job_area is not null");
            return (Criteria) this;
        }

        public Criteria andCJobAreaEqualTo(String value) {
            addCriterion("c_job_area =", value, "cJobArea");
            return (Criteria) this;
        }

        public Criteria andCJobAreaNotEqualTo(String value) {
            addCriterion("c_job_area <>", value, "cJobArea");
            return (Criteria) this;
        }

        public Criteria andCJobAreaGreaterThan(String value) {
            addCriterion("c_job_area >", value, "cJobArea");
            return (Criteria) this;
        }

        public Criteria andCJobAreaGreaterThanOrEqualTo(String value) {
            addCriterion("c_job_area >=", value, "cJobArea");
            return (Criteria) this;
        }

        public Criteria andCJobAreaLessThan(String value) {
            addCriterion("c_job_area <", value, "cJobArea");
            return (Criteria) this;
        }

        public Criteria andCJobAreaLessThanOrEqualTo(String value) {
            addCriterion("c_job_area <=", value, "cJobArea");
            return (Criteria) this;
        }

        public Criteria andCJobAreaLike(String value) {
            addCriterion("c_job_area like", value, "cJobArea");
            return (Criteria) this;
        }

        public Criteria andCJobAreaNotLike(String value) {
            addCriterion("c_job_area not like", value, "cJobArea");
            return (Criteria) this;
        }

        public Criteria andCJobAreaIn(List<String> values) {
            addCriterion("c_job_area in", values, "cJobArea");
            return (Criteria) this;
        }

        public Criteria andCJobAreaNotIn(List<String> values) {
            addCriterion("c_job_area not in", values, "cJobArea");
            return (Criteria) this;
        }

        public Criteria andCJobAreaBetween(String value1, String value2) {
            addCriterion("c_job_area between", value1, value2, "cJobArea");
            return (Criteria) this;
        }

        public Criteria andCJobAreaNotBetween(String value1, String value2) {
            addCriterion("c_job_area not between", value1, value2, "cJobArea");
            return (Criteria) this;
        }

        public Criteria andCJobPositionIsNull() {
            addCriterion("c_job_position is null");
            return (Criteria) this;
        }

        public Criteria andCJobPositionIsNotNull() {
            addCriterion("c_job_position is not null");
            return (Criteria) this;
        }

        public Criteria andCJobPositionEqualTo(String value) {
            addCriterion("c_job_position =", value, "cJobPosition");
            return (Criteria) this;
        }

        public Criteria andCJobPositionNotEqualTo(String value) {
            addCriterion("c_job_position <>", value, "cJobPosition");
            return (Criteria) this;
        }

        public Criteria andCJobPositionGreaterThan(String value) {
            addCriterion("c_job_position >", value, "cJobPosition");
            return (Criteria) this;
        }

        public Criteria andCJobPositionGreaterThanOrEqualTo(String value) {
            addCriterion("c_job_position >=", value, "cJobPosition");
            return (Criteria) this;
        }

        public Criteria andCJobPositionLessThan(String value) {
            addCriterion("c_job_position <", value, "cJobPosition");
            return (Criteria) this;
        }

        public Criteria andCJobPositionLessThanOrEqualTo(String value) {
            addCriterion("c_job_position <=", value, "cJobPosition");
            return (Criteria) this;
        }

        public Criteria andCJobPositionLike(String value) {
            addCriterion("c_job_position like", value, "cJobPosition");
            return (Criteria) this;
        }

        public Criteria andCJobPositionNotLike(String value) {
            addCriterion("c_job_position not like", value, "cJobPosition");
            return (Criteria) this;
        }

        public Criteria andCJobPositionIn(List<String> values) {
            addCriterion("c_job_position in", values, "cJobPosition");
            return (Criteria) this;
        }

        public Criteria andCJobPositionNotIn(List<String> values) {
            addCriterion("c_job_position not in", values, "cJobPosition");
            return (Criteria) this;
        }

        public Criteria andCJobPositionBetween(String value1, String value2) {
            addCriterion("c_job_position between", value1, value2, "cJobPosition");
            return (Criteria) this;
        }

        public Criteria andCJobPositionNotBetween(String value1, String value2) {
            addCriterion("c_job_position not between", value1, value2, "cJobPosition");
            return (Criteria) this;
        }

        public Criteria andCJobTypeIdIsNull() {
            addCriterion("c_job_type_id is null");
            return (Criteria) this;
        }

        public Criteria andCJobTypeIdIsNotNull() {
            addCriterion("c_job_type_id is not null");
            return (Criteria) this;
        }

        public Criteria andCJobTypeIdEqualTo(Integer value) {
            addCriterion("c_job_type_id =", value, "cJobTypeId");
            return (Criteria) this;
        }

        public Criteria andCJobTypeIdNotEqualTo(Integer value) {
            addCriterion("c_job_type_id <>", value, "cJobTypeId");
            return (Criteria) this;
        }

        public Criteria andCJobTypeIdGreaterThan(Integer value) {
            addCriterion("c_job_type_id >", value, "cJobTypeId");
            return (Criteria) this;
        }

        public Criteria andCJobTypeIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("c_job_type_id >=", value, "cJobTypeId");
            return (Criteria) this;
        }

        public Criteria andCJobTypeIdLessThan(Integer value) {
            addCriterion("c_job_type_id <", value, "cJobTypeId");
            return (Criteria) this;
        }

        public Criteria andCJobTypeIdLessThanOrEqualTo(Integer value) {
            addCriterion("c_job_type_id <=", value, "cJobTypeId");
            return (Criteria) this;
        }

        public Criteria andCJobTypeIdIn(List<Integer> values) {
            addCriterion("c_job_type_id in", values, "cJobTypeId");
            return (Criteria) this;
        }

        public Criteria andCJobTypeIdNotIn(List<Integer> values) {
            addCriterion("c_job_type_id not in", values, "cJobTypeId");
            return (Criteria) this;
        }

        public Criteria andCJobTypeIdBetween(Integer value1, Integer value2) {
            addCriterion("c_job_type_id between", value1, value2, "cJobTypeId");
            return (Criteria) this;
        }

        public Criteria andCJobTypeIdNotBetween(Integer value1, Integer value2) {
            addCriterion("c_job_type_id not between", value1, value2, "cJobTypeId");
            return (Criteria) this;
        }

        public Criteria andCJobPublishDateIsNull() {
            addCriterion("c_job_publish_date is null");
            return (Criteria) this;
        }

        public Criteria andCJobPublishDateIsNotNull() {
            addCriterion("c_job_publish_date is not null");
            return (Criteria) this;
        }

        public Criteria andCJobPublishDateEqualTo(Date value) {
            addCriterion("c_job_publish_date =", value, "cJobPublishDate");
            return (Criteria) this;
        }

        public Criteria andCJobPublishDateNotEqualTo(Date value) {
            addCriterion("c_job_publish_date <>", value, "cJobPublishDate");
            return (Criteria) this;
        }

        public Criteria andCJobPublishDateGreaterThan(Date value) {
            addCriterion("c_job_publish_date >", value, "cJobPublishDate");
            return (Criteria) this;
        }

        public Criteria andCJobPublishDateGreaterThanOrEqualTo(Date value) {
            addCriterion("c_job_publish_date >=", value, "cJobPublishDate");
            return (Criteria) this;
        }

        public Criteria andCJobPublishDateLessThan(Date value) {
            addCriterion("c_job_publish_date <", value, "cJobPublishDate");
            return (Criteria) this;
        }

        public Criteria andCJobPublishDateLessThanOrEqualTo(Date value) {
            addCriterion("c_job_publish_date <=", value, "cJobPublishDate");
            return (Criteria) this;
        }

        public Criteria andCJobPublishDateIn(List<Date> values) {
            addCriterion("c_job_publish_date in", values, "cJobPublishDate");
            return (Criteria) this;
        }

        public Criteria andCJobPublishDateNotIn(List<Date> values) {
            addCriterion("c_job_publish_date not in", values, "cJobPublishDate");
            return (Criteria) this;
        }

        public Criteria andCJobPublishDateBetween(Date value1, Date value2) {
            addCriterion("c_job_publish_date between", value1, value2, "cJobPublishDate");
            return (Criteria) this;
        }

        public Criteria andCJobPublishDateNotBetween(Date value1, Date value2) {
            addCriterion("c_job_publish_date not between", value1, value2, "cJobPublishDate");
            return (Criteria) this;
        }

        public Criteria andCJobWorkDateIsNull() {
            addCriterion("c_job_work_date is null");
            return (Criteria) this;
        }

        public Criteria andCJobWorkDateIsNotNull() {
            addCriterion("c_job_work_date is not null");
            return (Criteria) this;
        }

        public Criteria andCJobWorkDateEqualTo(String value) {
            addCriterion("c_job_work_date =", value, "cJobWorkDate");
            return (Criteria) this;
        }

        public Criteria andCJobWorkDateNotEqualTo(String value) {
            addCriterion("c_job_work_date <>", value, "cJobWorkDate");
            return (Criteria) this;
        }

        public Criteria andCJobWorkDateGreaterThan(String value) {
            addCriterion("c_job_work_date >", value, "cJobWorkDate");
            return (Criteria) this;
        }

        public Criteria andCJobWorkDateGreaterThanOrEqualTo(String value) {
            addCriterion("c_job_work_date >=", value, "cJobWorkDate");
            return (Criteria) this;
        }

        public Criteria andCJobWorkDateLessThan(String value) {
            addCriterion("c_job_work_date <", value, "cJobWorkDate");
            return (Criteria) this;
        }

        public Criteria andCJobWorkDateLessThanOrEqualTo(String value) {
            addCriterion("c_job_work_date <=", value, "cJobWorkDate");
            return (Criteria) this;
        }

        public Criteria andCJobWorkDateLike(String value) {
            addCriterion("c_job_work_date like", value, "cJobWorkDate");
            return (Criteria) this;
        }

        public Criteria andCJobWorkDateNotLike(String value) {
            addCriterion("c_job_work_date not like", value, "cJobWorkDate");
            return (Criteria) this;
        }

        public Criteria andCJobWorkDateIn(List<String> values) {
            addCriterion("c_job_work_date in", values, "cJobWorkDate");
            return (Criteria) this;
        }

        public Criteria andCJobWorkDateNotIn(List<String> values) {
            addCriterion("c_job_work_date not in", values, "cJobWorkDate");
            return (Criteria) this;
        }

        public Criteria andCJobWorkDateBetween(String value1, String value2) {
            addCriterion("c_job_work_date between", value1, value2, "cJobWorkDate");
            return (Criteria) this;
        }

        public Criteria andCJobWorkDateNotBetween(String value1, String value2) {
            addCriterion("c_job_work_date not between", value1, value2, "cJobWorkDate");
            return (Criteria) this;
        }

        public Criteria andCJobWorkTimeIsNull() {
            addCriterion("c_job_work_time is null");
            return (Criteria) this;
        }

        public Criteria andCJobWorkTimeIsNotNull() {
            addCriterion("c_job_work_time is not null");
            return (Criteria) this;
        }

        public Criteria andCJobWorkTimeEqualTo(String value) {
            addCriterion("c_job_work_time =", value, "cJobWorkTime");
            return (Criteria) this;
        }

        public Criteria andCJobWorkTimeNotEqualTo(String value) {
            addCriterion("c_job_work_time <>", value, "cJobWorkTime");
            return (Criteria) this;
        }

        public Criteria andCJobWorkTimeGreaterThan(String value) {
            addCriterion("c_job_work_time >", value, "cJobWorkTime");
            return (Criteria) this;
        }

        public Criteria andCJobWorkTimeGreaterThanOrEqualTo(String value) {
            addCriterion("c_job_work_time >=", value, "cJobWorkTime");
            return (Criteria) this;
        }

        public Criteria andCJobWorkTimeLessThan(String value) {
            addCriterion("c_job_work_time <", value, "cJobWorkTime");
            return (Criteria) this;
        }

        public Criteria andCJobWorkTimeLessThanOrEqualTo(String value) {
            addCriterion("c_job_work_time <=", value, "cJobWorkTime");
            return (Criteria) this;
        }

        public Criteria andCJobWorkTimeLike(String value) {
            addCriterion("c_job_work_time like", value, "cJobWorkTime");
            return (Criteria) this;
        }

        public Criteria andCJobWorkTimeNotLike(String value) {
            addCriterion("c_job_work_time not like", value, "cJobWorkTime");
            return (Criteria) this;
        }

        public Criteria andCJobWorkTimeIn(List<String> values) {
            addCriterion("c_job_work_time in", values, "cJobWorkTime");
            return (Criteria) this;
        }

        public Criteria andCJobWorkTimeNotIn(List<String> values) {
            addCriterion("c_job_work_time not in", values, "cJobWorkTime");
            return (Criteria) this;
        }

        public Criteria andCJobWorkTimeBetween(String value1, String value2) {
            addCriterion("c_job_work_time between", value1, value2, "cJobWorkTime");
            return (Criteria) this;
        }

        public Criteria andCJobWorkTimeNotBetween(String value1, String value2) {
            addCriterion("c_job_work_time not between", value1, value2, "cJobWorkTime");
            return (Criteria) this;
        }

        public Criteria andCJobGatherTimeIsNull() {
            addCriterion("c_job_gather_time is null");
            return (Criteria) this;
        }

        public Criteria andCJobGatherTimeIsNotNull() {
            addCriterion("c_job_gather_time is not null");
            return (Criteria) this;
        }

        public Criteria andCJobGatherTimeEqualTo(String value) {
            addCriterion("c_job_gather_time =", value, "cJobGatherTime");
            return (Criteria) this;
        }

        public Criteria andCJobGatherTimeNotEqualTo(String value) {
            addCriterion("c_job_gather_time <>", value, "cJobGatherTime");
            return (Criteria) this;
        }

        public Criteria andCJobGatherTimeGreaterThan(String value) {
            addCriterion("c_job_gather_time >", value, "cJobGatherTime");
            return (Criteria) this;
        }

        public Criteria andCJobGatherTimeGreaterThanOrEqualTo(String value) {
            addCriterion("c_job_gather_time >=", value, "cJobGatherTime");
            return (Criteria) this;
        }

        public Criteria andCJobGatherTimeLessThan(String value) {
            addCriterion("c_job_gather_time <", value, "cJobGatherTime");
            return (Criteria) this;
        }

        public Criteria andCJobGatherTimeLessThanOrEqualTo(String value) {
            addCriterion("c_job_gather_time <=", value, "cJobGatherTime");
            return (Criteria) this;
        }

        public Criteria andCJobGatherTimeLike(String value) {
            addCriterion("c_job_gather_time like", value, "cJobGatherTime");
            return (Criteria) this;
        }

        public Criteria andCJobGatherTimeNotLike(String value) {
            addCriterion("c_job_gather_time not like", value, "cJobGatherTime");
            return (Criteria) this;
        }

        public Criteria andCJobGatherTimeIn(List<String> values) {
            addCriterion("c_job_gather_time in", values, "cJobGatherTime");
            return (Criteria) this;
        }

        public Criteria andCJobGatherTimeNotIn(List<String> values) {
            addCriterion("c_job_gather_time not in", values, "cJobGatherTime");
            return (Criteria) this;
        }

        public Criteria andCJobGatherTimeBetween(String value1, String value2) {
            addCriterion("c_job_gather_time between", value1, value2, "cJobGatherTime");
            return (Criteria) this;
        }

        public Criteria andCJobGatherTimeNotBetween(String value1, String value2) {
            addCriterion("c_job_gather_time not between", value1, value2, "cJobGatherTime");
            return (Criteria) this;
        }

        public Criteria andCJobGatherLocationIdIsNull() {
            addCriterion("c_job_gather_location_id is null");
            return (Criteria) this;
        }

        public Criteria andCJobGatherLocationIdIsNotNull() {
            addCriterion("c_job_gather_location_id is not null");
            return (Criteria) this;
        }

        public Criteria andCJobGatherLocationIdEqualTo(Integer value) {
            addCriterion("c_job_gather_location_id =", value, "cJobGatherLocationId");
            return (Criteria) this;
        }

        public Criteria andCJobGatherLocationIdNotEqualTo(Integer value) {
            addCriterion("c_job_gather_location_id <>", value, "cJobGatherLocationId");
            return (Criteria) this;
        }

        public Criteria andCJobGatherLocationIdGreaterThan(Integer value) {
            addCriterion("c_job_gather_location_id >", value, "cJobGatherLocationId");
            return (Criteria) this;
        }

        public Criteria andCJobGatherLocationIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("c_job_gather_location_id >=", value, "cJobGatherLocationId");
            return (Criteria) this;
        }

        public Criteria andCJobGatherLocationIdLessThan(Integer value) {
            addCriterion("c_job_gather_location_id <", value, "cJobGatherLocationId");
            return (Criteria) this;
        }

        public Criteria andCJobGatherLocationIdLessThanOrEqualTo(Integer value) {
            addCriterion("c_job_gather_location_id <=", value, "cJobGatherLocationId");
            return (Criteria) this;
        }

        public Criteria andCJobGatherLocationIdIn(List<Integer> values) {
            addCriterion("c_job_gather_location_id in", values, "cJobGatherLocationId");
            return (Criteria) this;
        }

        public Criteria andCJobGatherLocationIdNotIn(List<Integer> values) {
            addCriterion("c_job_gather_location_id not in", values, "cJobGatherLocationId");
            return (Criteria) this;
        }

        public Criteria andCJobGatherLocationIdBetween(Integer value1, Integer value2) {
            addCriterion("c_job_gather_location_id between", value1, value2, "cJobGatherLocationId");
            return (Criteria) this;
        }

        public Criteria andCJobGatherLocationIdNotBetween(Integer value1, Integer value2) {
            addCriterion("c_job_gather_location_id not between", value1, value2, "cJobGatherLocationId");
            return (Criteria) this;
        }

        public Criteria andCJobTitleIsNull() {
            addCriterion("c_job_title is null");
            return (Criteria) this;
        }

        public Criteria andCJobTitleIsNotNull() {
            addCriterion("c_job_title is not null");
            return (Criteria) this;
        }

        public Criteria andCJobTitleEqualTo(String value) {
            addCriterion("c_job_title =", value, "cJobTitle");
            return (Criteria) this;
        }

        public Criteria andCJobTitleNotEqualTo(String value) {
            addCriterion("c_job_title <>", value, "cJobTitle");
            return (Criteria) this;
        }

        public Criteria andCJobTitleGreaterThan(String value) {
            addCriterion("c_job_title >", value, "cJobTitle");
            return (Criteria) this;
        }

        public Criteria andCJobTitleGreaterThanOrEqualTo(String value) {
            addCriterion("c_job_title >=", value, "cJobTitle");
            return (Criteria) this;
        }

        public Criteria andCJobTitleLessThan(String value) {
            addCriterion("c_job_title <", value, "cJobTitle");
            return (Criteria) this;
        }

        public Criteria andCJobTitleLessThanOrEqualTo(String value) {
            addCriterion("c_job_title <=", value, "cJobTitle");
            return (Criteria) this;
        }

        public Criteria andCJobTitleLike(String value) {
            addCriterion("c_job_title like", value, "cJobTitle");
            return (Criteria) this;
        }

        public Criteria andCJobTitleNotLike(String value) {
            addCriterion("c_job_title not like", value, "cJobTitle");
            return (Criteria) this;
        }

        public Criteria andCJobTitleIn(List<String> values) {
            addCriterion("c_job_title in", values, "cJobTitle");
            return (Criteria) this;
        }

        public Criteria andCJobTitleNotIn(List<String> values) {
            addCriterion("c_job_title not in", values, "cJobTitle");
            return (Criteria) this;
        }

        public Criteria andCJobTitleBetween(String value1, String value2) {
            addCriterion("c_job_title between", value1, value2, "cJobTitle");
            return (Criteria) this;
        }

        public Criteria andCJobTitleNotBetween(String value1, String value2) {
            addCriterion("c_job_title not between", value1, value2, "cJobTitle");
            return (Criteria) this;
        }

        public Criteria andCJobLocationIdIsNull() {
            addCriterion("c_job_location_id is null");
            return (Criteria) this;
        }

        public Criteria andCJobLocationIdIsNotNull() {
            addCriterion("c_job_location_id is not null");
            return (Criteria) this;
        }

        public Criteria andCJobLocationIdEqualTo(Integer value) {
            addCriterion("c_job_location_id =", value, "cJobLocationId");
            return (Criteria) this;
        }

        public Criteria andCJobLocationIdNotEqualTo(Integer value) {
            addCriterion("c_job_location_id <>", value, "cJobLocationId");
            return (Criteria) this;
        }

        public Criteria andCJobLocationIdGreaterThan(Integer value) {
            addCriterion("c_job_location_id >", value, "cJobLocationId");
            return (Criteria) this;
        }

        public Criteria andCJobLocationIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("c_job_location_id >=", value, "cJobLocationId");
            return (Criteria) this;
        }

        public Criteria andCJobLocationIdLessThan(Integer value) {
            addCriterion("c_job_location_id <", value, "cJobLocationId");
            return (Criteria) this;
        }

        public Criteria andCJobLocationIdLessThanOrEqualTo(Integer value) {
            addCriterion("c_job_location_id <=", value, "cJobLocationId");
            return (Criteria) this;
        }

        public Criteria andCJobLocationIdIn(List<Integer> values) {
            addCriterion("c_job_location_id in", values, "cJobLocationId");
            return (Criteria) this;
        }

        public Criteria andCJobLocationIdNotIn(List<Integer> values) {
            addCriterion("c_job_location_id not in", values, "cJobLocationId");
            return (Criteria) this;
        }

        public Criteria andCJobLocationIdBetween(Integer value1, Integer value2) {
            addCriterion("c_job_location_id between", value1, value2, "cJobLocationId");
            return (Criteria) this;
        }

        public Criteria andCJobLocationIdNotBetween(Integer value1, Integer value2) {
            addCriterion("c_job_location_id not between", value1, value2, "cJobLocationId");
            return (Criteria) this;
        }

        public Criteria andCJobSalaryIsNull() {
            addCriterion("c_job_salary is null");
            return (Criteria) this;
        }

        public Criteria andCJobSalaryIsNotNull() {
            addCriterion("c_job_salary is not null");
            return (Criteria) this;
        }

        public Criteria andCJobSalaryEqualTo(String value) {
            addCriterion("c_job_salary =", value, "cJobSalary");
            return (Criteria) this;
        }

        public Criteria andCJobSalaryNotEqualTo(String value) {
            addCriterion("c_job_salary <>", value, "cJobSalary");
            return (Criteria) this;
        }

        public Criteria andCJobSalaryGreaterThan(String value) {
            addCriterion("c_job_salary >", value, "cJobSalary");
            return (Criteria) this;
        }

        public Criteria andCJobSalaryGreaterThanOrEqualTo(String value) {
            addCriterion("c_job_salary >=", value, "cJobSalary");
            return (Criteria) this;
        }

        public Criteria andCJobSalaryLessThan(String value) {
            addCriterion("c_job_salary <", value, "cJobSalary");
            return (Criteria) this;
        }

        public Criteria andCJobSalaryLessThanOrEqualTo(String value) {
            addCriterion("c_job_salary <=", value, "cJobSalary");
            return (Criteria) this;
        }

        public Criteria andCJobSalaryLike(String value) {
            addCriterion("c_job_salary like", value, "cJobSalary");
            return (Criteria) this;
        }

        public Criteria andCJobSalaryNotLike(String value) {
            addCriterion("c_job_salary not like", value, "cJobSalary");
            return (Criteria) this;
        }

        public Criteria andCJobSalaryIn(List<String> values) {
            addCriterion("c_job_salary in", values, "cJobSalary");
            return (Criteria) this;
        }

        public Criteria andCJobSalaryNotIn(List<String> values) {
            addCriterion("c_job_salary not in", values, "cJobSalary");
            return (Criteria) this;
        }

        public Criteria andCJobSalaryBetween(String value1, String value2) {
            addCriterion("c_job_salary between", value1, value2, "cJobSalary");
            return (Criteria) this;
        }

        public Criteria andCJobSalaryNotBetween(String value1, String value2) {
            addCriterion("c_job_salary not between", value1, value2, "cJobSalary");
            return (Criteria) this;
        }

        public Criteria andCJobPayMethodIsNull() {
            addCriterion("c_job_pay_method is null");
            return (Criteria) this;
        }

        public Criteria andCJobPayMethodIsNotNull() {
            addCriterion("c_job_pay_method is not null");
            return (Criteria) this;
        }

        public Criteria andCJobPayMethodEqualTo(String value) {
            addCriterion("c_job_pay_method =", value, "cJobPayMethod");
            return (Criteria) this;
        }

        public Criteria andCJobPayMethodNotEqualTo(String value) {
            addCriterion("c_job_pay_method <>", value, "cJobPayMethod");
            return (Criteria) this;
        }

        public Criteria andCJobPayMethodGreaterThan(String value) {
            addCriterion("c_job_pay_method >", value, "cJobPayMethod");
            return (Criteria) this;
        }

        public Criteria andCJobPayMethodGreaterThanOrEqualTo(String value) {
            addCriterion("c_job_pay_method >=", value, "cJobPayMethod");
            return (Criteria) this;
        }

        public Criteria andCJobPayMethodLessThan(String value) {
            addCriterion("c_job_pay_method <", value, "cJobPayMethod");
            return (Criteria) this;
        }

        public Criteria andCJobPayMethodLessThanOrEqualTo(String value) {
            addCriterion("c_job_pay_method <=", value, "cJobPayMethod");
            return (Criteria) this;
        }

        public Criteria andCJobPayMethodLike(String value) {
            addCriterion("c_job_pay_method like", value, "cJobPayMethod");
            return (Criteria) this;
        }

        public Criteria andCJobPayMethodNotLike(String value) {
            addCriterion("c_job_pay_method not like", value, "cJobPayMethod");
            return (Criteria) this;
        }

        public Criteria andCJobPayMethodIn(List<String> values) {
            addCriterion("c_job_pay_method in", values, "cJobPayMethod");
            return (Criteria) this;
        }

        public Criteria andCJobPayMethodNotIn(List<String> values) {
            addCriterion("c_job_pay_method not in", values, "cJobPayMethod");
            return (Criteria) this;
        }

        public Criteria andCJobPayMethodBetween(String value1, String value2) {
            addCriterion("c_job_pay_method between", value1, value2, "cJobPayMethod");
            return (Criteria) this;
        }

        public Criteria andCJobPayMethodNotBetween(String value1, String value2) {
            addCriterion("c_job_pay_method not between", value1, value2, "cJobPayMethod");
            return (Criteria) this;
        }

        public Criteria andCJobChoiceOpIdIsNull() {
            addCriterion("c_job_choice_op_id is null");
            return (Criteria) this;
        }

        public Criteria andCJobChoiceOpIdIsNotNull() {
            addCriterion("c_job_choice_op_id is not null");
            return (Criteria) this;
        }

        public Criteria andCJobChoiceOpIdEqualTo(Integer value) {
            addCriterion("c_job_choice_op_id =", value, "cJobChoiceOpId");
            return (Criteria) this;
        }

        public Criteria andCJobChoiceOpIdNotEqualTo(Integer value) {
            addCriterion("c_job_choice_op_id <>", value, "cJobChoiceOpId");
            return (Criteria) this;
        }

        public Criteria andCJobChoiceOpIdGreaterThan(Integer value) {
            addCriterion("c_job_choice_op_id >", value, "cJobChoiceOpId");
            return (Criteria) this;
        }

        public Criteria andCJobChoiceOpIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("c_job_choice_op_id >=", value, "cJobChoiceOpId");
            return (Criteria) this;
        }

        public Criteria andCJobChoiceOpIdLessThan(Integer value) {
            addCriterion("c_job_choice_op_id <", value, "cJobChoiceOpId");
            return (Criteria) this;
        }

        public Criteria andCJobChoiceOpIdLessThanOrEqualTo(Integer value) {
            addCriterion("c_job_choice_op_id <=", value, "cJobChoiceOpId");
            return (Criteria) this;
        }

        public Criteria andCJobChoiceOpIdIn(List<Integer> values) {
            addCriterion("c_job_choice_op_id in", values, "cJobChoiceOpId");
            return (Criteria) this;
        }

        public Criteria andCJobChoiceOpIdNotIn(List<Integer> values) {
            addCriterion("c_job_choice_op_id not in", values, "cJobChoiceOpId");
            return (Criteria) this;
        }

        public Criteria andCJobChoiceOpIdBetween(Integer value1, Integer value2) {
            addCriterion("c_job_choice_op_id between", value1, value2, "cJobChoiceOpId");
            return (Criteria) this;
        }

        public Criteria andCJobChoiceOpIdNotBetween(Integer value1, Integer value2) {
            addCriterion("c_job_choice_op_id not between", value1, value2, "cJobChoiceOpId");
            return (Criteria) this;
        }

        public Criteria andCJobTotalPersonIsNull() {
            addCriterion("c_job_total_person is null");
            return (Criteria) this;
        }

        public Criteria andCJobTotalPersonIsNotNull() {
            addCriterion("c_job_total_person is not null");
            return (Criteria) this;
        }

        public Criteria andCJobTotalPersonEqualTo(Integer value) {
            addCriterion("c_job_total_person =", value, "cJobTotalPerson");
            return (Criteria) this;
        }

        public Criteria andCJobTotalPersonNotEqualTo(Integer value) {
            addCriterion("c_job_total_person <>", value, "cJobTotalPerson");
            return (Criteria) this;
        }

        public Criteria andCJobTotalPersonGreaterThan(Integer value) {
            addCriterion("c_job_total_person >", value, "cJobTotalPerson");
            return (Criteria) this;
        }

        public Criteria andCJobTotalPersonGreaterThanOrEqualTo(Integer value) {
            addCriterion("c_job_total_person >=", value, "cJobTotalPerson");
            return (Criteria) this;
        }

        public Criteria andCJobTotalPersonLessThan(Integer value) {
            addCriterion("c_job_total_person <", value, "cJobTotalPerson");
            return (Criteria) this;
        }

        public Criteria andCJobTotalPersonLessThanOrEqualTo(Integer value) {
            addCriterion("c_job_total_person <=", value, "cJobTotalPerson");
            return (Criteria) this;
        }

        public Criteria andCJobTotalPersonIn(List<Integer> values) {
            addCriterion("c_job_total_person in", values, "cJobTotalPerson");
            return (Criteria) this;
        }

        public Criteria andCJobTotalPersonNotIn(List<Integer> values) {
            addCriterion("c_job_total_person not in", values, "cJobTotalPerson");
            return (Criteria) this;
        }

        public Criteria andCJobTotalPersonBetween(Integer value1, Integer value2) {
            addCriterion("c_job_total_person between", value1, value2, "cJobTotalPerson");
            return (Criteria) this;
        }

        public Criteria andCJobTotalPersonNotBetween(Integer value1, Integer value2) {
            addCriterion("c_job_total_person not between", value1, value2, "cJobTotalPerson");
            return (Criteria) this;
        }

        public Criteria andCJobPersonGenderIsNull() {
            addCriterion("c_job_person_gender is null");
            return (Criteria) this;
        }

        public Criteria andCJobPersonGenderIsNotNull() {
            addCriterion("c_job_person_gender is not null");
            return (Criteria) this;
        }

        public Criteria andCJobPersonGenderEqualTo(String value) {
            addCriterion("c_job_person_gender =", value, "cJobPersonGender");
            return (Criteria) this;
        }

        public Criteria andCJobPersonGenderNotEqualTo(String value) {
            addCriterion("c_job_person_gender <>", value, "cJobPersonGender");
            return (Criteria) this;
        }

        public Criteria andCJobPersonGenderGreaterThan(String value) {
            addCriterion("c_job_person_gender >", value, "cJobPersonGender");
            return (Criteria) this;
        }

        public Criteria andCJobPersonGenderGreaterThanOrEqualTo(String value) {
            addCriterion("c_job_person_gender >=", value, "cJobPersonGender");
            return (Criteria) this;
        }

        public Criteria andCJobPersonGenderLessThan(String value) {
            addCriterion("c_job_person_gender <", value, "cJobPersonGender");
            return (Criteria) this;
        }

        public Criteria andCJobPersonGenderLessThanOrEqualTo(String value) {
            addCriterion("c_job_person_gender <=", value, "cJobPersonGender");
            return (Criteria) this;
        }

        public Criteria andCJobPersonGenderLike(String value) {
            addCriterion("c_job_person_gender like", value, "cJobPersonGender");
            return (Criteria) this;
        }

        public Criteria andCJobPersonGenderNotLike(String value) {
            addCriterion("c_job_person_gender not like", value, "cJobPersonGender");
            return (Criteria) this;
        }

        public Criteria andCJobPersonGenderIn(List<String> values) {
            addCriterion("c_job_person_gender in", values, "cJobPersonGender");
            return (Criteria) this;
        }

        public Criteria andCJobPersonGenderNotIn(List<String> values) {
            addCriterion("c_job_person_gender not in", values, "cJobPersonGender");
            return (Criteria) this;
        }

        public Criteria andCJobPersonGenderBetween(String value1, String value2) {
            addCriterion("c_job_person_gender between", value1, value2, "cJobPersonGender");
            return (Criteria) this;
        }

        public Criteria andCJobPersonGenderNotBetween(String value1, String value2) {
            addCriterion("c_job_person_gender not between", value1, value2, "cJobPersonGender");
            return (Criteria) this;
        }

        public Criteria andCJobStateIsNull() {
            addCriterion("c_job_state is null");
            return (Criteria) this;
        }

        public Criteria andCJobStateIsNotNull() {
            addCriterion("c_job_state is not null");
            return (Criteria) this;
        }

        public Criteria andCJobStateEqualTo(String value) {
            addCriterion("c_job_state =", value, "cJobState");
            return (Criteria) this;
        }

        public Criteria andCJobStateNotEqualTo(String value) {
            addCriterion("c_job_state <>", value, "cJobState");
            return (Criteria) this;
        }

        public Criteria andCJobStateGreaterThan(String value) {
            addCriterion("c_job_state >", value, "cJobState");
            return (Criteria) this;
        }

        public Criteria andCJobStateGreaterThanOrEqualTo(String value) {
            addCriterion("c_job_state >=", value, "cJobState");
            return (Criteria) this;
        }

        public Criteria andCJobStateLessThan(String value) {
            addCriterion("c_job_state <", value, "cJobState");
            return (Criteria) this;
        }

        public Criteria andCJobStateLessThanOrEqualTo(String value) {
            addCriterion("c_job_state <=", value, "cJobState");
            return (Criteria) this;
        }

        public Criteria andCJobStateLike(String value) {
            addCriterion("c_job_state like", value, "cJobState");
            return (Criteria) this;
        }

        public Criteria andCJobStateNotLike(String value) {
            addCriterion("c_job_state not like", value, "cJobState");
            return (Criteria) this;
        }

        public Criteria andCJobStateIn(List<String> values) {
            addCriterion("c_job_state in", values, "cJobState");
            return (Criteria) this;
        }

        public Criteria andCJobStateNotIn(List<String> values) {
            addCriterion("c_job_state not in", values, "cJobState");
            return (Criteria) this;
        }

        public Criteria andCJobStateBetween(String value1, String value2) {
            addCriterion("c_job_state between", value1, value2, "cJobState");
            return (Criteria) this;
        }

        public Criteria andCJobStateNotBetween(String value1, String value2) {
            addCriterion("c_job_state not between", value1, value2, "cJobState");
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