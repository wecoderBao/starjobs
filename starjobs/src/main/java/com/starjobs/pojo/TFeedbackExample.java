package com.starjobs.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TFeedbackExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TFeedbackExample() {
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

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Integer value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Integer value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Integer> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Integer> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Integer value1, Integer value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Integer value1, Integer value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andPhoneIsNull() {
            addCriterion("phone is null");
            return (Criteria) this;
        }

        public Criteria andPhoneIsNotNull() {
            addCriterion("phone is not null");
            return (Criteria) this;
        }

        public Criteria andPhoneEqualTo(String value) {
            addCriterion("phone =", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneNotEqualTo(String value) {
            addCriterion("phone <>", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneGreaterThan(String value) {
            addCriterion("phone >", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneGreaterThanOrEqualTo(String value) {
            addCriterion("phone >=", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneLessThan(String value) {
            addCriterion("phone <", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneLessThanOrEqualTo(String value) {
            addCriterion("phone <=", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneLike(String value) {
            addCriterion("phone like", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneNotLike(String value) {
            addCriterion("phone not like", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneIn(List<String> values) {
            addCriterion("phone in", values, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneNotIn(List<String> values) {
            addCriterion("phone not in", values, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneBetween(String value1, String value2) {
            addCriterion("phone between", value1, value2, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneNotBetween(String value1, String value2) {
            addCriterion("phone not between", value1, value2, "phone");
            return (Criteria) this;
        }

        public Criteria andPicOneIsNull() {
            addCriterion("pic_one is null");
            return (Criteria) this;
        }

        public Criteria andPicOneIsNotNull() {
            addCriterion("pic_one is not null");
            return (Criteria) this;
        }

        public Criteria andPicOneEqualTo(String value) {
            addCriterion("pic_one =", value, "picOne");
            return (Criteria) this;
        }

        public Criteria andPicOneNotEqualTo(String value) {
            addCriterion("pic_one <>", value, "picOne");
            return (Criteria) this;
        }

        public Criteria andPicOneGreaterThan(String value) {
            addCriterion("pic_one >", value, "picOne");
            return (Criteria) this;
        }

        public Criteria andPicOneGreaterThanOrEqualTo(String value) {
            addCriterion("pic_one >=", value, "picOne");
            return (Criteria) this;
        }

        public Criteria andPicOneLessThan(String value) {
            addCriterion("pic_one <", value, "picOne");
            return (Criteria) this;
        }

        public Criteria andPicOneLessThanOrEqualTo(String value) {
            addCriterion("pic_one <=", value, "picOne");
            return (Criteria) this;
        }

        public Criteria andPicOneLike(String value) {
            addCriterion("pic_one like", value, "picOne");
            return (Criteria) this;
        }

        public Criteria andPicOneNotLike(String value) {
            addCriterion("pic_one not like", value, "picOne");
            return (Criteria) this;
        }

        public Criteria andPicOneIn(List<String> values) {
            addCriterion("pic_one in", values, "picOne");
            return (Criteria) this;
        }

        public Criteria andPicOneNotIn(List<String> values) {
            addCriterion("pic_one not in", values, "picOne");
            return (Criteria) this;
        }

        public Criteria andPicOneBetween(String value1, String value2) {
            addCriterion("pic_one between", value1, value2, "picOne");
            return (Criteria) this;
        }

        public Criteria andPicOneNotBetween(String value1, String value2) {
            addCriterion("pic_one not between", value1, value2, "picOne");
            return (Criteria) this;
        }

        public Criteria andPicTowIsNull() {
            addCriterion("pic_tow is null");
            return (Criteria) this;
        }

        public Criteria andPicTowIsNotNull() {
            addCriterion("pic_tow is not null");
            return (Criteria) this;
        }

        public Criteria andPicTowEqualTo(String value) {
            addCriterion("pic_tow =", value, "picTow");
            return (Criteria) this;
        }

        public Criteria andPicTowNotEqualTo(String value) {
            addCriterion("pic_tow <>", value, "picTow");
            return (Criteria) this;
        }

        public Criteria andPicTowGreaterThan(String value) {
            addCriterion("pic_tow >", value, "picTow");
            return (Criteria) this;
        }

        public Criteria andPicTowGreaterThanOrEqualTo(String value) {
            addCriterion("pic_tow >=", value, "picTow");
            return (Criteria) this;
        }

        public Criteria andPicTowLessThan(String value) {
            addCriterion("pic_tow <", value, "picTow");
            return (Criteria) this;
        }

        public Criteria andPicTowLessThanOrEqualTo(String value) {
            addCriterion("pic_tow <=", value, "picTow");
            return (Criteria) this;
        }

        public Criteria andPicTowLike(String value) {
            addCriterion("pic_tow like", value, "picTow");
            return (Criteria) this;
        }

        public Criteria andPicTowNotLike(String value) {
            addCriterion("pic_tow not like", value, "picTow");
            return (Criteria) this;
        }

        public Criteria andPicTowIn(List<String> values) {
            addCriterion("pic_tow in", values, "picTow");
            return (Criteria) this;
        }

        public Criteria andPicTowNotIn(List<String> values) {
            addCriterion("pic_tow not in", values, "picTow");
            return (Criteria) this;
        }

        public Criteria andPicTowBetween(String value1, String value2) {
            addCriterion("pic_tow between", value1, value2, "picTow");
            return (Criteria) this;
        }

        public Criteria andPicTowNotBetween(String value1, String value2) {
            addCriterion("pic_tow not between", value1, value2, "picTow");
            return (Criteria) this;
        }

        public Criteria andPicThreeIsNull() {
            addCriterion("pic_three is null");
            return (Criteria) this;
        }

        public Criteria andPicThreeIsNotNull() {
            addCriterion("pic_three is not null");
            return (Criteria) this;
        }

        public Criteria andPicThreeEqualTo(String value) {
            addCriterion("pic_three =", value, "picThree");
            return (Criteria) this;
        }

        public Criteria andPicThreeNotEqualTo(String value) {
            addCriterion("pic_three <>", value, "picThree");
            return (Criteria) this;
        }

        public Criteria andPicThreeGreaterThan(String value) {
            addCriterion("pic_three >", value, "picThree");
            return (Criteria) this;
        }

        public Criteria andPicThreeGreaterThanOrEqualTo(String value) {
            addCriterion("pic_three >=", value, "picThree");
            return (Criteria) this;
        }

        public Criteria andPicThreeLessThan(String value) {
            addCriterion("pic_three <", value, "picThree");
            return (Criteria) this;
        }

        public Criteria andPicThreeLessThanOrEqualTo(String value) {
            addCriterion("pic_three <=", value, "picThree");
            return (Criteria) this;
        }

        public Criteria andPicThreeLike(String value) {
            addCriterion("pic_three like", value, "picThree");
            return (Criteria) this;
        }

        public Criteria andPicThreeNotLike(String value) {
            addCriterion("pic_three not like", value, "picThree");
            return (Criteria) this;
        }

        public Criteria andPicThreeIn(List<String> values) {
            addCriterion("pic_three in", values, "picThree");
            return (Criteria) this;
        }

        public Criteria andPicThreeNotIn(List<String> values) {
            addCriterion("pic_three not in", values, "picThree");
            return (Criteria) this;
        }

        public Criteria andPicThreeBetween(String value1, String value2) {
            addCriterion("pic_three between", value1, value2, "picThree");
            return (Criteria) this;
        }

        public Criteria andPicThreeNotBetween(String value1, String value2) {
            addCriterion("pic_three not between", value1, value2, "picThree");
            return (Criteria) this;
        }

        public Criteria andContentIsNull() {
            addCriterion("content is null");
            return (Criteria) this;
        }

        public Criteria andContentIsNotNull() {
            addCriterion("content is not null");
            return (Criteria) this;
        }

        public Criteria andContentEqualTo(String value) {
            addCriterion("content =", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentNotEqualTo(String value) {
            addCriterion("content <>", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentGreaterThan(String value) {
            addCriterion("content >", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentGreaterThanOrEqualTo(String value) {
            addCriterion("content >=", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentLessThan(String value) {
            addCriterion("content <", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentLessThanOrEqualTo(String value) {
            addCriterion("content <=", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentLike(String value) {
            addCriterion("content like", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentNotLike(String value) {
            addCriterion("content not like", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentIn(List<String> values) {
            addCriterion("content in", values, "content");
            return (Criteria) this;
        }

        public Criteria andContentNotIn(List<String> values) {
            addCriterion("content not in", values, "content");
            return (Criteria) this;
        }

        public Criteria andContentBetween(String value1, String value2) {
            addCriterion("content between", value1, value2, "content");
            return (Criteria) this;
        }

        public Criteria andContentNotBetween(String value1, String value2) {
            addCriterion("content not between", value1, value2, "content");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNull() {
            addCriterion("create_time is null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNotNull() {
            addCriterion("create_time is not null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeEqualTo(Date value) {
            addCriterion("create_time =", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotEqualTo(Date value) {
            addCriterion("create_time <>", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThan(Date value) {
            addCriterion("create_time >", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("create_time >=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThan(Date value) {
            addCriterion("create_time <", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThanOrEqualTo(Date value) {
            addCriterion("create_time <=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIn(List<Date> values) {
            addCriterion("create_time in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotIn(List<Date> values) {
            addCriterion("create_time not in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeBetween(Date value1, Date value2) {
            addCriterion("create_time between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotBetween(Date value1, Date value2) {
            addCriterion("create_time not between", value1, value2, "createTime");
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