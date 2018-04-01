package com.starjobs.pojo;

import java.util.ArrayList;
import java.util.List;

public class TGroupMemberExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TGroupMemberExample() {
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

        public Criteria andCIdIsNull() {
            addCriterion("c_id is null");
            return (Criteria) this;
        }

        public Criteria andCIdIsNotNull() {
            addCriterion("c_id is not null");
            return (Criteria) this;
        }

        public Criteria andCIdEqualTo(Integer value) {
            addCriterion("c_id =", value, "cId");
            return (Criteria) this;
        }

        public Criteria andCIdNotEqualTo(Integer value) {
            addCriterion("c_id <>", value, "cId");
            return (Criteria) this;
        }

        public Criteria andCIdGreaterThan(Integer value) {
            addCriterion("c_id >", value, "cId");
            return (Criteria) this;
        }

        public Criteria andCIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("c_id >=", value, "cId");
            return (Criteria) this;
        }

        public Criteria andCIdLessThan(Integer value) {
            addCriterion("c_id <", value, "cId");
            return (Criteria) this;
        }

        public Criteria andCIdLessThanOrEqualTo(Integer value) {
            addCriterion("c_id <=", value, "cId");
            return (Criteria) this;
        }

        public Criteria andCIdIn(List<Integer> values) {
            addCriterion("c_id in", values, "cId");
            return (Criteria) this;
        }

        public Criteria andCIdNotIn(List<Integer> values) {
            addCriterion("c_id not in", values, "cId");
            return (Criteria) this;
        }

        public Criteria andCIdBetween(Integer value1, Integer value2) {
            addCriterion("c_id between", value1, value2, "cId");
            return (Criteria) this;
        }

        public Criteria andCIdNotBetween(Integer value1, Integer value2) {
            addCriterion("c_id not between", value1, value2, "cId");
            return (Criteria) this;
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

        public Criteria andCGroupMemberIdIsNull() {
            addCriterion("c_group_member_id is null");
            return (Criteria) this;
        }

        public Criteria andCGroupMemberIdIsNotNull() {
            addCriterion("c_group_member_id is not null");
            return (Criteria) this;
        }

        public Criteria andCGroupMemberIdEqualTo(String value) {
            addCriterion("c_group_member_id =", value, "cGroupMemberId");
            return (Criteria) this;
        }

        public Criteria andCGroupMemberIdNotEqualTo(String value) {
            addCriterion("c_group_member_id <>", value, "cGroupMemberId");
            return (Criteria) this;
        }

        public Criteria andCGroupMemberIdGreaterThan(String value) {
            addCriterion("c_group_member_id >", value, "cGroupMemberId");
            return (Criteria) this;
        }

        public Criteria andCGroupMemberIdGreaterThanOrEqualTo(String value) {
            addCriterion("c_group_member_id >=", value, "cGroupMemberId");
            return (Criteria) this;
        }

        public Criteria andCGroupMemberIdLessThan(String value) {
            addCriterion("c_group_member_id <", value, "cGroupMemberId");
            return (Criteria) this;
        }

        public Criteria andCGroupMemberIdLessThanOrEqualTo(String value) {
            addCriterion("c_group_member_id <=", value, "cGroupMemberId");
            return (Criteria) this;
        }

        public Criteria andCGroupMemberIdLike(String value) {
            addCriterion("c_group_member_id like", value, "cGroupMemberId");
            return (Criteria) this;
        }

        public Criteria andCGroupMemberIdNotLike(String value) {
            addCriterion("c_group_member_id not like", value, "cGroupMemberId");
            return (Criteria) this;
        }

        public Criteria andCGroupMemberIdIn(List<String> values) {
            addCriterion("c_group_member_id in", values, "cGroupMemberId");
            return (Criteria) this;
        }

        public Criteria andCGroupMemberIdNotIn(List<String> values) {
            addCriterion("c_group_member_id not in", values, "cGroupMemberId");
            return (Criteria) this;
        }

        public Criteria andCGroupMemberIdBetween(String value1, String value2) {
            addCriterion("c_group_member_id between", value1, value2, "cGroupMemberId");
            return (Criteria) this;
        }

        public Criteria andCGroupMemberIdNotBetween(String value1, String value2) {
            addCriterion("c_group_member_id not between", value1, value2, "cGroupMemberId");
            return (Criteria) this;
        }

        public Criteria andCGroupMemberIdentityIsNull() {
            addCriterion("c_group_member_identity is null");
            return (Criteria) this;
        }

        public Criteria andCGroupMemberIdentityIsNotNull() {
            addCriterion("c_group_member_identity is not null");
            return (Criteria) this;
        }

        public Criteria andCGroupMemberIdentityEqualTo(String value) {
            addCriterion("c_group_member_identity =", value, "cGroupMemberIdentity");
            return (Criteria) this;
        }

        public Criteria andCGroupMemberIdentityNotEqualTo(String value) {
            addCriterion("c_group_member_identity <>", value, "cGroupMemberIdentity");
            return (Criteria) this;
        }

        public Criteria andCGroupMemberIdentityGreaterThan(String value) {
            addCriterion("c_group_member_identity >", value, "cGroupMemberIdentity");
            return (Criteria) this;
        }

        public Criteria andCGroupMemberIdentityGreaterThanOrEqualTo(String value) {
            addCriterion("c_group_member_identity >=", value, "cGroupMemberIdentity");
            return (Criteria) this;
        }

        public Criteria andCGroupMemberIdentityLessThan(String value) {
            addCriterion("c_group_member_identity <", value, "cGroupMemberIdentity");
            return (Criteria) this;
        }

        public Criteria andCGroupMemberIdentityLessThanOrEqualTo(String value) {
            addCriterion("c_group_member_identity <=", value, "cGroupMemberIdentity");
            return (Criteria) this;
        }

        public Criteria andCGroupMemberIdentityLike(String value) {
            addCriterion("c_group_member_identity like", value, "cGroupMemberIdentity");
            return (Criteria) this;
        }

        public Criteria andCGroupMemberIdentityNotLike(String value) {
            addCriterion("c_group_member_identity not like", value, "cGroupMemberIdentity");
            return (Criteria) this;
        }

        public Criteria andCGroupMemberIdentityIn(List<String> values) {
            addCriterion("c_group_member_identity in", values, "cGroupMemberIdentity");
            return (Criteria) this;
        }

        public Criteria andCGroupMemberIdentityNotIn(List<String> values) {
            addCriterion("c_group_member_identity not in", values, "cGroupMemberIdentity");
            return (Criteria) this;
        }

        public Criteria andCGroupMemberIdentityBetween(String value1, String value2) {
            addCriterion("c_group_member_identity between", value1, value2, "cGroupMemberIdentity");
            return (Criteria) this;
        }

        public Criteria andCGroupMemberIdentityNotBetween(String value1, String value2) {
            addCriterion("c_group_member_identity not between", value1, value2, "cGroupMemberIdentity");
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