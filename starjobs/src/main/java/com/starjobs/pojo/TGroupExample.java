package com.starjobs.pojo;

import java.util.ArrayList;
import java.util.List;

public class TGroupExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TGroupExample() {
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

        public Criteria andCGroupIdIsNull() {
            addCriterion("c_group_id is null");
            return (Criteria) this;
        }

        public Criteria andCGroupIdIsNotNull() {
            addCriterion("c_group_id is not null");
            return (Criteria) this;
        }

        public Criteria andCGroupIdEqualTo(Integer value) {
            addCriterion("c_group_id =", value, "cGroupId");
            return (Criteria) this;
        }

        public Criteria andCGroupIdNotEqualTo(Integer value) {
            addCriterion("c_group_id <>", value, "cGroupId");
            return (Criteria) this;
        }

        public Criteria andCGroupIdGreaterThan(Integer value) {
            addCriterion("c_group_id >", value, "cGroupId");
            return (Criteria) this;
        }

        public Criteria andCGroupIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("c_group_id >=", value, "cGroupId");
            return (Criteria) this;
        }

        public Criteria andCGroupIdLessThan(Integer value) {
            addCriterion("c_group_id <", value, "cGroupId");
            return (Criteria) this;
        }

        public Criteria andCGroupIdLessThanOrEqualTo(Integer value) {
            addCriterion("c_group_id <=", value, "cGroupId");
            return (Criteria) this;
        }

        public Criteria andCGroupIdIn(List<Integer> values) {
            addCriterion("c_group_id in", values, "cGroupId");
            return (Criteria) this;
        }

        public Criteria andCGroupIdNotIn(List<Integer> values) {
            addCriterion("c_group_id not in", values, "cGroupId");
            return (Criteria) this;
        }

        public Criteria andCGroupIdBetween(Integer value1, Integer value2) {
            addCriterion("c_group_id between", value1, value2, "cGroupId");
            return (Criteria) this;
        }

        public Criteria andCGroupIdNotBetween(Integer value1, Integer value2) {
            addCriterion("c_group_id not between", value1, value2, "cGroupId");
            return (Criteria) this;
        }

        public Criteria andCGroupCreaterIdIsNull() {
            addCriterion("c_group_creater_id is null");
            return (Criteria) this;
        }

        public Criteria andCGroupCreaterIdIsNotNull() {
            addCriterion("c_group_creater_id is not null");
            return (Criteria) this;
        }

        public Criteria andCGroupCreaterIdEqualTo(String value) {
            addCriterion("c_group_creater_id =", value, "cGroupCreaterId");
            return (Criteria) this;
        }

        public Criteria andCGroupCreaterIdNotEqualTo(String value) {
            addCriterion("c_group_creater_id <>", value, "cGroupCreaterId");
            return (Criteria) this;
        }

        public Criteria andCGroupCreaterIdGreaterThan(String value) {
            addCriterion("c_group_creater_id >", value, "cGroupCreaterId");
            return (Criteria) this;
        }

        public Criteria andCGroupCreaterIdGreaterThanOrEqualTo(String value) {
            addCriterion("c_group_creater_id >=", value, "cGroupCreaterId");
            return (Criteria) this;
        }

        public Criteria andCGroupCreaterIdLessThan(String value) {
            addCriterion("c_group_creater_id <", value, "cGroupCreaterId");
            return (Criteria) this;
        }

        public Criteria andCGroupCreaterIdLessThanOrEqualTo(String value) {
            addCriterion("c_group_creater_id <=", value, "cGroupCreaterId");
            return (Criteria) this;
        }

        public Criteria andCGroupCreaterIdLike(String value) {
            addCriterion("c_group_creater_id like", value, "cGroupCreaterId");
            return (Criteria) this;
        }

        public Criteria andCGroupCreaterIdNotLike(String value) {
            addCriterion("c_group_creater_id not like", value, "cGroupCreaterId");
            return (Criteria) this;
        }

        public Criteria andCGroupCreaterIdIn(List<String> values) {
            addCriterion("c_group_creater_id in", values, "cGroupCreaterId");
            return (Criteria) this;
        }

        public Criteria andCGroupCreaterIdNotIn(List<String> values) {
            addCriterion("c_group_creater_id not in", values, "cGroupCreaterId");
            return (Criteria) this;
        }

        public Criteria andCGroupCreaterIdBetween(String value1, String value2) {
            addCriterion("c_group_creater_id between", value1, value2, "cGroupCreaterId");
            return (Criteria) this;
        }

        public Criteria andCGroupCreaterIdNotBetween(String value1, String value2) {
            addCriterion("c_group_creater_id not between", value1, value2, "cGroupCreaterId");
            return (Criteria) this;
        }

        public Criteria andCGroupHeadImgIsNull() {
            addCriterion("c_group_head_img is null");
            return (Criteria) this;
        }

        public Criteria andCGroupHeadImgIsNotNull() {
            addCriterion("c_group_head_img is not null");
            return (Criteria) this;
        }

        public Criteria andCGroupHeadImgEqualTo(String value) {
            addCriterion("c_group_head_img =", value, "cGroupHeadImg");
            return (Criteria) this;
        }

        public Criteria andCGroupHeadImgNotEqualTo(String value) {
            addCriterion("c_group_head_img <>", value, "cGroupHeadImg");
            return (Criteria) this;
        }

        public Criteria andCGroupHeadImgGreaterThan(String value) {
            addCriterion("c_group_head_img >", value, "cGroupHeadImg");
            return (Criteria) this;
        }

        public Criteria andCGroupHeadImgGreaterThanOrEqualTo(String value) {
            addCriterion("c_group_head_img >=", value, "cGroupHeadImg");
            return (Criteria) this;
        }

        public Criteria andCGroupHeadImgLessThan(String value) {
            addCriterion("c_group_head_img <", value, "cGroupHeadImg");
            return (Criteria) this;
        }

        public Criteria andCGroupHeadImgLessThanOrEqualTo(String value) {
            addCriterion("c_group_head_img <=", value, "cGroupHeadImg");
            return (Criteria) this;
        }

        public Criteria andCGroupHeadImgLike(String value) {
            addCriterion("c_group_head_img like", value, "cGroupHeadImg");
            return (Criteria) this;
        }

        public Criteria andCGroupHeadImgNotLike(String value) {
            addCriterion("c_group_head_img not like", value, "cGroupHeadImg");
            return (Criteria) this;
        }

        public Criteria andCGroupHeadImgIn(List<String> values) {
            addCriterion("c_group_head_img in", values, "cGroupHeadImg");
            return (Criteria) this;
        }

        public Criteria andCGroupHeadImgNotIn(List<String> values) {
            addCriterion("c_group_head_img not in", values, "cGroupHeadImg");
            return (Criteria) this;
        }

        public Criteria andCGroupHeadImgBetween(String value1, String value2) {
            addCriterion("c_group_head_img between", value1, value2, "cGroupHeadImg");
            return (Criteria) this;
        }

        public Criteria andCGroupHeadImgNotBetween(String value1, String value2) {
            addCriterion("c_group_head_img not between", value1, value2, "cGroupHeadImg");
            return (Criteria) this;
        }

        public Criteria andCGroupNameIsNull() {
            addCriterion("c_group_name is null");
            return (Criteria) this;
        }

        public Criteria andCGroupNameIsNotNull() {
            addCriterion("c_group_name is not null");
            return (Criteria) this;
        }

        public Criteria andCGroupNameEqualTo(String value) {
            addCriterion("c_group_name =", value, "cGroupName");
            return (Criteria) this;
        }

        public Criteria andCGroupNameNotEqualTo(String value) {
            addCriterion("c_group_name <>", value, "cGroupName");
            return (Criteria) this;
        }

        public Criteria andCGroupNameGreaterThan(String value) {
            addCriterion("c_group_name >", value, "cGroupName");
            return (Criteria) this;
        }

        public Criteria andCGroupNameGreaterThanOrEqualTo(String value) {
            addCriterion("c_group_name >=", value, "cGroupName");
            return (Criteria) this;
        }

        public Criteria andCGroupNameLessThan(String value) {
            addCriterion("c_group_name <", value, "cGroupName");
            return (Criteria) this;
        }

        public Criteria andCGroupNameLessThanOrEqualTo(String value) {
            addCriterion("c_group_name <=", value, "cGroupName");
            return (Criteria) this;
        }

        public Criteria andCGroupNameLike(String value) {
            addCriterion("c_group_name like", value, "cGroupName");
            return (Criteria) this;
        }

        public Criteria andCGroupNameNotLike(String value) {
            addCriterion("c_group_name not like", value, "cGroupName");
            return (Criteria) this;
        }

        public Criteria andCGroupNameIn(List<String> values) {
            addCriterion("c_group_name in", values, "cGroupName");
            return (Criteria) this;
        }

        public Criteria andCGroupNameNotIn(List<String> values) {
            addCriterion("c_group_name not in", values, "cGroupName");
            return (Criteria) this;
        }

        public Criteria andCGroupNameBetween(String value1, String value2) {
            addCriterion("c_group_name between", value1, value2, "cGroupName");
            return (Criteria) this;
        }

        public Criteria andCGroupNameNotBetween(String value1, String value2) {
            addCriterion("c_group_name not between", value1, value2, "cGroupName");
            return (Criteria) this;
        }

        public Criteria andCGroupStatuIsNull() {
            addCriterion("c_group_statu is null");
            return (Criteria) this;
        }

        public Criteria andCGroupStatuIsNotNull() {
            addCriterion("c_group_statu is not null");
            return (Criteria) this;
        }

        public Criteria andCGroupStatuEqualTo(String value) {
            addCriterion("c_group_statu =", value, "cGroupStatu");
            return (Criteria) this;
        }

        public Criteria andCGroupStatuNotEqualTo(String value) {
            addCriterion("c_group_statu <>", value, "cGroupStatu");
            return (Criteria) this;
        }

        public Criteria andCGroupStatuGreaterThan(String value) {
            addCriterion("c_group_statu >", value, "cGroupStatu");
            return (Criteria) this;
        }

        public Criteria andCGroupStatuGreaterThanOrEqualTo(String value) {
            addCriterion("c_group_statu >=", value, "cGroupStatu");
            return (Criteria) this;
        }

        public Criteria andCGroupStatuLessThan(String value) {
            addCriterion("c_group_statu <", value, "cGroupStatu");
            return (Criteria) this;
        }

        public Criteria andCGroupStatuLessThanOrEqualTo(String value) {
            addCriterion("c_group_statu <=", value, "cGroupStatu");
            return (Criteria) this;
        }

        public Criteria andCGroupStatuLike(String value) {
            addCriterion("c_group_statu like", value, "cGroupStatu");
            return (Criteria) this;
        }

        public Criteria andCGroupStatuNotLike(String value) {
            addCriterion("c_group_statu not like", value, "cGroupStatu");
            return (Criteria) this;
        }

        public Criteria andCGroupStatuIn(List<String> values) {
            addCriterion("c_group_statu in", values, "cGroupStatu");
            return (Criteria) this;
        }

        public Criteria andCGroupStatuNotIn(List<String> values) {
            addCriterion("c_group_statu not in", values, "cGroupStatu");
            return (Criteria) this;
        }

        public Criteria andCGroupStatuBetween(String value1, String value2) {
            addCriterion("c_group_statu between", value1, value2, "cGroupStatu");
            return (Criteria) this;
        }

        public Criteria andCGroupStatuNotBetween(String value1, String value2) {
            addCriterion("c_group_statu not between", value1, value2, "cGroupStatu");
            return (Criteria) this;
        }

        public Criteria andCJobIdIsNull() {
            addCriterion("c_job_id is null");
            return (Criteria) this;
        }

        public Criteria andCJobIdIsNotNull() {
            addCriterion("c_job_id is not null");
            return (Criteria) this;
        }

        public Criteria andCJobIdEqualTo(String value) {
            addCriterion("c_job_id =", value, "cJobId");
            return (Criteria) this;
        }

        public Criteria andCJobIdNotEqualTo(String value) {
            addCriterion("c_job_id <>", value, "cJobId");
            return (Criteria) this;
        }

        public Criteria andCJobIdGreaterThan(String value) {
            addCriterion("c_job_id >", value, "cJobId");
            return (Criteria) this;
        }

        public Criteria andCJobIdGreaterThanOrEqualTo(String value) {
            addCriterion("c_job_id >=", value, "cJobId");
            return (Criteria) this;
        }

        public Criteria andCJobIdLessThan(String value) {
            addCriterion("c_job_id <", value, "cJobId");
            return (Criteria) this;
        }

        public Criteria andCJobIdLessThanOrEqualTo(String value) {
            addCriterion("c_job_id <=", value, "cJobId");
            return (Criteria) this;
        }

        public Criteria andCJobIdLike(String value) {
            addCriterion("c_job_id like", value, "cJobId");
            return (Criteria) this;
        }

        public Criteria andCJobIdNotLike(String value) {
            addCriterion("c_job_id not like", value, "cJobId");
            return (Criteria) this;
        }

        public Criteria andCJobIdIn(List<String> values) {
            addCriterion("c_job_id in", values, "cJobId");
            return (Criteria) this;
        }

        public Criteria andCJobIdNotIn(List<String> values) {
            addCriterion("c_job_id not in", values, "cJobId");
            return (Criteria) this;
        }

        public Criteria andCJobIdBetween(String value1, String value2) {
            addCriterion("c_job_id between", value1, value2, "cJobId");
            return (Criteria) this;
        }

        public Criteria andCJobIdNotBetween(String value1, String value2) {
            addCriterion("c_job_id not between", value1, value2, "cJobId");
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