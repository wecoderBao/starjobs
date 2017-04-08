package com.starjobs.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
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

        public Criteria andCJobTypeIsNull() {
            addCriterion("c_job_type is null");
            return (Criteria) this;
        }

        public Criteria andCJobTypeIsNotNull() {
            addCriterion("c_job_type is not null");
            return (Criteria) this;
        }

        public Criteria andCJobTypeEqualTo(String value) {
            addCriterion("c_job_type =", value, "cJobType");
            return (Criteria) this;
        }

        public Criteria andCJobTypeNotEqualTo(String value) {
            addCriterion("c_job_type <>", value, "cJobType");
            return (Criteria) this;
        }

        public Criteria andCJobTypeGreaterThan(String value) {
            addCriterion("c_job_type >", value, "cJobType");
            return (Criteria) this;
        }

        public Criteria andCJobTypeGreaterThanOrEqualTo(String value) {
            addCriterion("c_job_type >=", value, "cJobType");
            return (Criteria) this;
        }

        public Criteria andCJobTypeLessThan(String value) {
            addCriterion("c_job_type <", value, "cJobType");
            return (Criteria) this;
        }

        public Criteria andCJobTypeLessThanOrEqualTo(String value) {
            addCriterion("c_job_type <=", value, "cJobType");
            return (Criteria) this;
        }

        public Criteria andCJobTypeLike(String value) {
            addCriterion("c_job_type like", value, "cJobType");
            return (Criteria) this;
        }

        public Criteria andCJobTypeNotLike(String value) {
            addCriterion("c_job_type not like", value, "cJobType");
            return (Criteria) this;
        }

        public Criteria andCJobTypeIn(List<String> values) {
            addCriterion("c_job_type in", values, "cJobType");
            return (Criteria) this;
        }

        public Criteria andCJobTypeNotIn(List<String> values) {
            addCriterion("c_job_type not in", values, "cJobType");
            return (Criteria) this;
        }

        public Criteria andCJobTypeBetween(String value1, String value2) {
            addCriterion("c_job_type between", value1, value2, "cJobType");
            return (Criteria) this;
        }

        public Criteria andCJobTypeNotBetween(String value1, String value2) {
            addCriterion("c_job_type not between", value1, value2, "cJobType");
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
            addCriterionForJDBCDate("c_job_publish_date =", value, "cJobPublishDate");
            return (Criteria) this;
        }

        public Criteria andCJobPublishDateNotEqualTo(Date value) {
            addCriterionForJDBCDate("c_job_publish_date <>", value, "cJobPublishDate");
            return (Criteria) this;
        }

        public Criteria andCJobPublishDateGreaterThan(Date value) {
            addCriterionForJDBCDate("c_job_publish_date >", value, "cJobPublishDate");
            return (Criteria) this;
        }

        public Criteria andCJobPublishDateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("c_job_publish_date >=", value, "cJobPublishDate");
            return (Criteria) this;
        }

        public Criteria andCJobPublishDateLessThan(Date value) {
            addCriterionForJDBCDate("c_job_publish_date <", value, "cJobPublishDate");
            return (Criteria) this;
        }

        public Criteria andCJobPublishDateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("c_job_publish_date <=", value, "cJobPublishDate");
            return (Criteria) this;
        }

        public Criteria andCJobPublishDateIn(List<Date> values) {
            addCriterionForJDBCDate("c_job_publish_date in", values, "cJobPublishDate");
            return (Criteria) this;
        }

        public Criteria andCJobPublishDateNotIn(List<Date> values) {
            addCriterionForJDBCDate("c_job_publish_date not in", values, "cJobPublishDate");
            return (Criteria) this;
        }

        public Criteria andCJobPublishDateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("c_job_publish_date between", value1, value2, "cJobPublishDate");
            return (Criteria) this;
        }

        public Criteria andCJobPublishDateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("c_job_publish_date not between", value1, value2, "cJobPublishDate");
            return (Criteria) this;
        }

        public Criteria andCJobBeginDateIsNull() {
            addCriterion("c_job_begin_date is null");
            return (Criteria) this;
        }

        public Criteria andCJobBeginDateIsNotNull() {
            addCriterion("c_job_begin_date is not null");
            return (Criteria) this;
        }

        public Criteria andCJobBeginDateEqualTo(Date value) {
            addCriterionForJDBCDate("c_job_begin_date =", value, "cJobBeginDate");
            return (Criteria) this;
        }

        public Criteria andCJobBeginDateNotEqualTo(Date value) {
            addCriterionForJDBCDate("c_job_begin_date <>", value, "cJobBeginDate");
            return (Criteria) this;
        }

        public Criteria andCJobBeginDateGreaterThan(Date value) {
            addCriterionForJDBCDate("c_job_begin_date >", value, "cJobBeginDate");
            return (Criteria) this;
        }

        public Criteria andCJobBeginDateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("c_job_begin_date >=", value, "cJobBeginDate");
            return (Criteria) this;
        }

        public Criteria andCJobBeginDateLessThan(Date value) {
            addCriterionForJDBCDate("c_job_begin_date <", value, "cJobBeginDate");
            return (Criteria) this;
        }

        public Criteria andCJobBeginDateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("c_job_begin_date <=", value, "cJobBeginDate");
            return (Criteria) this;
        }

        public Criteria andCJobBeginDateIn(List<Date> values) {
            addCriterionForJDBCDate("c_job_begin_date in", values, "cJobBeginDate");
            return (Criteria) this;
        }

        public Criteria andCJobBeginDateNotIn(List<Date> values) {
            addCriterionForJDBCDate("c_job_begin_date not in", values, "cJobBeginDate");
            return (Criteria) this;
        }

        public Criteria andCJobBeginDateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("c_job_begin_date between", value1, value2, "cJobBeginDate");
            return (Criteria) this;
        }

        public Criteria andCJobBeginDateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("c_job_begin_date not between", value1, value2, "cJobBeginDate");
            return (Criteria) this;
        }

        public Criteria andCJobEndDateIsNull() {
            addCriterion("c_job_end_date is null");
            return (Criteria) this;
        }

        public Criteria andCJobEndDateIsNotNull() {
            addCriterion("c_job_end_date is not null");
            return (Criteria) this;
        }

        public Criteria andCJobEndDateEqualTo(Date value) {
            addCriterionForJDBCDate("c_job_end_date =", value, "cJobEndDate");
            return (Criteria) this;
        }

        public Criteria andCJobEndDateNotEqualTo(Date value) {
            addCriterionForJDBCDate("c_job_end_date <>", value, "cJobEndDate");
            return (Criteria) this;
        }

        public Criteria andCJobEndDateGreaterThan(Date value) {
            addCriterionForJDBCDate("c_job_end_date >", value, "cJobEndDate");
            return (Criteria) this;
        }

        public Criteria andCJobEndDateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("c_job_end_date >=", value, "cJobEndDate");
            return (Criteria) this;
        }

        public Criteria andCJobEndDateLessThan(Date value) {
            addCriterionForJDBCDate("c_job_end_date <", value, "cJobEndDate");
            return (Criteria) this;
        }

        public Criteria andCJobEndDateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("c_job_end_date <=", value, "cJobEndDate");
            return (Criteria) this;
        }

        public Criteria andCJobEndDateIn(List<Date> values) {
            addCriterionForJDBCDate("c_job_end_date in", values, "cJobEndDate");
            return (Criteria) this;
        }

        public Criteria andCJobEndDateNotIn(List<Date> values) {
            addCriterionForJDBCDate("c_job_end_date not in", values, "cJobEndDate");
            return (Criteria) this;
        }

        public Criteria andCJobEndDateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("c_job_end_date between", value1, value2, "cJobEndDate");
            return (Criteria) this;
        }

        public Criteria andCJobEndDateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("c_job_end_date not between", value1, value2, "cJobEndDate");
            return (Criteria) this;
        }

        public Criteria andCJobRestTimeIsNull() {
            addCriterion("c_job_rest_time is null");
            return (Criteria) this;
        }

        public Criteria andCJobRestTimeIsNotNull() {
            addCriterion("c_job_rest_time is not null");
            return (Criteria) this;
        }

        public Criteria andCJobRestTimeEqualTo(Date value) {
            addCriterionForJDBCDate("c_job_rest_time =", value, "cJobRestTime");
            return (Criteria) this;
        }

        public Criteria andCJobRestTimeNotEqualTo(Date value) {
            addCriterionForJDBCDate("c_job_rest_time <>", value, "cJobRestTime");
            return (Criteria) this;
        }

        public Criteria andCJobRestTimeGreaterThan(Date value) {
            addCriterionForJDBCDate("c_job_rest_time >", value, "cJobRestTime");
            return (Criteria) this;
        }

        public Criteria andCJobRestTimeGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("c_job_rest_time >=", value, "cJobRestTime");
            return (Criteria) this;
        }

        public Criteria andCJobRestTimeLessThan(Date value) {
            addCriterionForJDBCDate("c_job_rest_time <", value, "cJobRestTime");
            return (Criteria) this;
        }

        public Criteria andCJobRestTimeLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("c_job_rest_time <=", value, "cJobRestTime");
            return (Criteria) this;
        }

        public Criteria andCJobRestTimeIn(List<Date> values) {
            addCriterionForJDBCDate("c_job_rest_time in", values, "cJobRestTime");
            return (Criteria) this;
        }

        public Criteria andCJobRestTimeNotIn(List<Date> values) {
            addCriterionForJDBCDate("c_job_rest_time not in", values, "cJobRestTime");
            return (Criteria) this;
        }

        public Criteria andCJobRestTimeBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("c_job_rest_time between", value1, value2, "cJobRestTime");
            return (Criteria) this;
        }

        public Criteria andCJobRestTimeNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("c_job_rest_time not between", value1, value2, "cJobRestTime");
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

        public Criteria andCJobGatherTimeEqualTo(Date value) {
            addCriterionForJDBCDate("c_job_gather_time =", value, "cJobGatherTime");
            return (Criteria) this;
        }

        public Criteria andCJobGatherTimeNotEqualTo(Date value) {
            addCriterionForJDBCDate("c_job_gather_time <>", value, "cJobGatherTime");
            return (Criteria) this;
        }

        public Criteria andCJobGatherTimeGreaterThan(Date value) {
            addCriterionForJDBCDate("c_job_gather_time >", value, "cJobGatherTime");
            return (Criteria) this;
        }

        public Criteria andCJobGatherTimeGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("c_job_gather_time >=", value, "cJobGatherTime");
            return (Criteria) this;
        }

        public Criteria andCJobGatherTimeLessThan(Date value) {
            addCriterionForJDBCDate("c_job_gather_time <", value, "cJobGatherTime");
            return (Criteria) this;
        }

        public Criteria andCJobGatherTimeLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("c_job_gather_time <=", value, "cJobGatherTime");
            return (Criteria) this;
        }

        public Criteria andCJobGatherTimeIn(List<Date> values) {
            addCriterionForJDBCDate("c_job_gather_time in", values, "cJobGatherTime");
            return (Criteria) this;
        }

        public Criteria andCJobGatherTimeNotIn(List<Date> values) {
            addCriterionForJDBCDate("c_job_gather_time not in", values, "cJobGatherTime");
            return (Criteria) this;
        }

        public Criteria andCJobGatherTimeBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("c_job_gather_time between", value1, value2, "cJobGatherTime");
            return (Criteria) this;
        }

        public Criteria andCJobGatherTimeNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("c_job_gather_time not between", value1, value2, "cJobGatherTime");
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

        public Criteria andCJobGatherLocationIdEqualTo(String value) {
            addCriterion("c_job_gather_location_id =", value, "cJobGatherLocationId");
            return (Criteria) this;
        }

        public Criteria andCJobGatherLocationIdNotEqualTo(String value) {
            addCriterion("c_job_gather_location_id <>", value, "cJobGatherLocationId");
            return (Criteria) this;
        }

        public Criteria andCJobGatherLocationIdGreaterThan(String value) {
            addCriterion("c_job_gather_location_id >", value, "cJobGatherLocationId");
            return (Criteria) this;
        }

        public Criteria andCJobGatherLocationIdGreaterThanOrEqualTo(String value) {
            addCriterion("c_job_gather_location_id >=", value, "cJobGatherLocationId");
            return (Criteria) this;
        }

        public Criteria andCJobGatherLocationIdLessThan(String value) {
            addCriterion("c_job_gather_location_id <", value, "cJobGatherLocationId");
            return (Criteria) this;
        }

        public Criteria andCJobGatherLocationIdLessThanOrEqualTo(String value) {
            addCriterion("c_job_gather_location_id <=", value, "cJobGatherLocationId");
            return (Criteria) this;
        }

        public Criteria andCJobGatherLocationIdLike(String value) {
            addCriterion("c_job_gather_location_id like", value, "cJobGatherLocationId");
            return (Criteria) this;
        }

        public Criteria andCJobGatherLocationIdNotLike(String value) {
            addCriterion("c_job_gather_location_id not like", value, "cJobGatherLocationId");
            return (Criteria) this;
        }

        public Criteria andCJobGatherLocationIdIn(List<String> values) {
            addCriterion("c_job_gather_location_id in", values, "cJobGatherLocationId");
            return (Criteria) this;
        }

        public Criteria andCJobGatherLocationIdNotIn(List<String> values) {
            addCriterion("c_job_gather_location_id not in", values, "cJobGatherLocationId");
            return (Criteria) this;
        }

        public Criteria andCJobGatherLocationIdBetween(String value1, String value2) {
            addCriterion("c_job_gather_location_id between", value1, value2, "cJobGatherLocationId");
            return (Criteria) this;
        }

        public Criteria andCJobGatherLocationIdNotBetween(String value1, String value2) {
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

        public Criteria andCJobSalaryEqualTo(Integer value) {
            addCriterion("c_job_salary =", value, "cJobSalary");
            return (Criteria) this;
        }

        public Criteria andCJobSalaryNotEqualTo(Integer value) {
            addCriterion("c_job_salary <>", value, "cJobSalary");
            return (Criteria) this;
        }

        public Criteria andCJobSalaryGreaterThan(Integer value) {
            addCriterion("c_job_salary >", value, "cJobSalary");
            return (Criteria) this;
        }

        public Criteria andCJobSalaryGreaterThanOrEqualTo(Integer value) {
            addCriterion("c_job_salary >=", value, "cJobSalary");
            return (Criteria) this;
        }

        public Criteria andCJobSalaryLessThan(Integer value) {
            addCriterion("c_job_salary <", value, "cJobSalary");
            return (Criteria) this;
        }

        public Criteria andCJobSalaryLessThanOrEqualTo(Integer value) {
            addCriterion("c_job_salary <=", value, "cJobSalary");
            return (Criteria) this;
        }

        public Criteria andCJobSalaryIn(List<Integer> values) {
            addCriterion("c_job_salary in", values, "cJobSalary");
            return (Criteria) this;
        }

        public Criteria andCJobSalaryNotIn(List<Integer> values) {
            addCriterion("c_job_salary not in", values, "cJobSalary");
            return (Criteria) this;
        }

        public Criteria andCJobSalaryBetween(Integer value1, Integer value2) {
            addCriterion("c_job_salary between", value1, value2, "cJobSalary");
            return (Criteria) this;
        }

        public Criteria andCJobSalaryNotBetween(Integer value1, Integer value2) {
            addCriterion("c_job_salary not between", value1, value2, "cJobSalary");
            return (Criteria) this;
        }

        public Criteria andCJobSalaryExtraIsNull() {
            addCriterion("c_job_salary_extra is null");
            return (Criteria) this;
        }

        public Criteria andCJobSalaryExtraIsNotNull() {
            addCriterion("c_job_salary_extra is not null");
            return (Criteria) this;
        }

        public Criteria andCJobSalaryExtraEqualTo(String value) {
            addCriterion("c_job_salary_extra =", value, "cJobSalaryExtra");
            return (Criteria) this;
        }

        public Criteria andCJobSalaryExtraNotEqualTo(String value) {
            addCriterion("c_job_salary_extra <>", value, "cJobSalaryExtra");
            return (Criteria) this;
        }

        public Criteria andCJobSalaryExtraGreaterThan(String value) {
            addCriterion("c_job_salary_extra >", value, "cJobSalaryExtra");
            return (Criteria) this;
        }

        public Criteria andCJobSalaryExtraGreaterThanOrEqualTo(String value) {
            addCriterion("c_job_salary_extra >=", value, "cJobSalaryExtra");
            return (Criteria) this;
        }

        public Criteria andCJobSalaryExtraLessThan(String value) {
            addCriterion("c_job_salary_extra <", value, "cJobSalaryExtra");
            return (Criteria) this;
        }

        public Criteria andCJobSalaryExtraLessThanOrEqualTo(String value) {
            addCriterion("c_job_salary_extra <=", value, "cJobSalaryExtra");
            return (Criteria) this;
        }

        public Criteria andCJobSalaryExtraLike(String value) {
            addCriterion("c_job_salary_extra like", value, "cJobSalaryExtra");
            return (Criteria) this;
        }

        public Criteria andCJobSalaryExtraNotLike(String value) {
            addCriterion("c_job_salary_extra not like", value, "cJobSalaryExtra");
            return (Criteria) this;
        }

        public Criteria andCJobSalaryExtraIn(List<String> values) {
            addCriterion("c_job_salary_extra in", values, "cJobSalaryExtra");
            return (Criteria) this;
        }

        public Criteria andCJobSalaryExtraNotIn(List<String> values) {
            addCriterion("c_job_salary_extra not in", values, "cJobSalaryExtra");
            return (Criteria) this;
        }

        public Criteria andCJobSalaryExtraBetween(String value1, String value2) {
            addCriterion("c_job_salary_extra between", value1, value2, "cJobSalaryExtra");
            return (Criteria) this;
        }

        public Criteria andCJobSalaryExtraNotBetween(String value1, String value2) {
            addCriterion("c_job_salary_extra not between", value1, value2, "cJobSalaryExtra");
            return (Criteria) this;
        }

        public Criteria andCJobCloseMethodIsNull() {
            addCriterion("c_job_close_method is null");
            return (Criteria) this;
        }

        public Criteria andCJobCloseMethodIsNotNull() {
            addCriterion("c_job_close_method is not null");
            return (Criteria) this;
        }

        public Criteria andCJobCloseMethodEqualTo(String value) {
            addCriterion("c_job_close_method =", value, "cJobCloseMethod");
            return (Criteria) this;
        }

        public Criteria andCJobCloseMethodNotEqualTo(String value) {
            addCriterion("c_job_close_method <>", value, "cJobCloseMethod");
            return (Criteria) this;
        }

        public Criteria andCJobCloseMethodGreaterThan(String value) {
            addCriterion("c_job_close_method >", value, "cJobCloseMethod");
            return (Criteria) this;
        }

        public Criteria andCJobCloseMethodGreaterThanOrEqualTo(String value) {
            addCriterion("c_job_close_method >=", value, "cJobCloseMethod");
            return (Criteria) this;
        }

        public Criteria andCJobCloseMethodLessThan(String value) {
            addCriterion("c_job_close_method <", value, "cJobCloseMethod");
            return (Criteria) this;
        }

        public Criteria andCJobCloseMethodLessThanOrEqualTo(String value) {
            addCriterion("c_job_close_method <=", value, "cJobCloseMethod");
            return (Criteria) this;
        }

        public Criteria andCJobCloseMethodLike(String value) {
            addCriterion("c_job_close_method like", value, "cJobCloseMethod");
            return (Criteria) this;
        }

        public Criteria andCJobCloseMethodNotLike(String value) {
            addCriterion("c_job_close_method not like", value, "cJobCloseMethod");
            return (Criteria) this;
        }

        public Criteria andCJobCloseMethodIn(List<String> values) {
            addCriterion("c_job_close_method in", values, "cJobCloseMethod");
            return (Criteria) this;
        }

        public Criteria andCJobCloseMethodNotIn(List<String> values) {
            addCriterion("c_job_close_method not in", values, "cJobCloseMethod");
            return (Criteria) this;
        }

        public Criteria andCJobCloseMethodBetween(String value1, String value2) {
            addCriterion("c_job_close_method between", value1, value2, "cJobCloseMethod");
            return (Criteria) this;
        }

        public Criteria andCJobCloseMethodNotBetween(String value1, String value2) {
            addCriterion("c_job_close_method not between", value1, value2, "cJobCloseMethod");
            return (Criteria) this;
        }

        public Criteria andCJobChoiceOpIsNull() {
            addCriterion("c_job_choice_op is null");
            return (Criteria) this;
        }

        public Criteria andCJobChoiceOpIsNotNull() {
            addCriterion("c_job_choice_op is not null");
            return (Criteria) this;
        }

        public Criteria andCJobChoiceOpEqualTo(String value) {
            addCriterion("c_job_choice_op =", value, "cJobChoiceOp");
            return (Criteria) this;
        }

        public Criteria andCJobChoiceOpNotEqualTo(String value) {
            addCriterion("c_job_choice_op <>", value, "cJobChoiceOp");
            return (Criteria) this;
        }

        public Criteria andCJobChoiceOpGreaterThan(String value) {
            addCriterion("c_job_choice_op >", value, "cJobChoiceOp");
            return (Criteria) this;
        }

        public Criteria andCJobChoiceOpGreaterThanOrEqualTo(String value) {
            addCriterion("c_job_choice_op >=", value, "cJobChoiceOp");
            return (Criteria) this;
        }

        public Criteria andCJobChoiceOpLessThan(String value) {
            addCriterion("c_job_choice_op <", value, "cJobChoiceOp");
            return (Criteria) this;
        }

        public Criteria andCJobChoiceOpLessThanOrEqualTo(String value) {
            addCriterion("c_job_choice_op <=", value, "cJobChoiceOp");
            return (Criteria) this;
        }

        public Criteria andCJobChoiceOpLike(String value) {
            addCriterion("c_job_choice_op like", value, "cJobChoiceOp");
            return (Criteria) this;
        }

        public Criteria andCJobChoiceOpNotLike(String value) {
            addCriterion("c_job_choice_op not like", value, "cJobChoiceOp");
            return (Criteria) this;
        }

        public Criteria andCJobChoiceOpIn(List<String> values) {
            addCriterion("c_job_choice_op in", values, "cJobChoiceOp");
            return (Criteria) this;
        }

        public Criteria andCJobChoiceOpNotIn(List<String> values) {
            addCriterion("c_job_choice_op not in", values, "cJobChoiceOp");
            return (Criteria) this;
        }

        public Criteria andCJobChoiceOpBetween(String value1, String value2) {
            addCriterion("c_job_choice_op between", value1, value2, "cJobChoiceOp");
            return (Criteria) this;
        }

        public Criteria andCJobChoiceOpNotBetween(String value1, String value2) {
            addCriterion("c_job_choice_op not between", value1, value2, "cJobChoiceOp");
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