package org.java201913.springboot_web_huitao.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class StoreupExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public StoreupExample() {
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

        public Criteria andCoidIsNull() {
            addCriterion("coid is null");
            return (Criteria) this;
        }

        public Criteria andCoidIsNotNull() {
            addCriterion("coid is not null");
            return (Criteria) this;
        }

        public Criteria andCoidEqualTo(Integer value) {
            addCriterion("coid =", value, "coid");
            return (Criteria) this;
        }

        public Criteria andCoidNotEqualTo(Integer value) {
            addCriterion("coid <>", value, "coid");
            return (Criteria) this;
        }

        public Criteria andCoidGreaterThan(Integer value) {
            addCriterion("coid >", value, "coid");
            return (Criteria) this;
        }

        public Criteria andCoidGreaterThanOrEqualTo(Integer value) {
            addCriterion("coid >=", value, "coid");
            return (Criteria) this;
        }

        public Criteria andCoidLessThan(Integer value) {
            addCriterion("coid <", value, "coid");
            return (Criteria) this;
        }

        public Criteria andCoidLessThanOrEqualTo(Integer value) {
            addCriterion("coid <=", value, "coid");
            return (Criteria) this;
        }

        public Criteria andCoidIn(List<Integer> values) {
            addCriterion("coid in", values, "coid");
            return (Criteria) this;
        }

        public Criteria andCoidNotIn(List<Integer> values) {
            addCriterion("coid not in", values, "coid");
            return (Criteria) this;
        }

        public Criteria andCoidBetween(Integer value1, Integer value2) {
            addCriterion("coid between", value1, value2, "coid");
            return (Criteria) this;
        }

        public Criteria andCoidNotBetween(Integer value1, Integer value2) {
            addCriterion("coid not between", value1, value2, "coid");
            return (Criteria) this;
        }

        public Criteria andCoSidIsNull() {
            addCriterion("co_sid is null");
            return (Criteria) this;
        }

        public Criteria andCoSidIsNotNull() {
            addCriterion("co_sid is not null");
            return (Criteria) this;
        }

        public Criteria andCoSidEqualTo(Integer value) {
            addCriterion("co_sid =", value, "coSid");
            return (Criteria) this;
        }

        public Criteria andCoSidNotEqualTo(Integer value) {
            addCriterion("co_sid <>", value, "coSid");
            return (Criteria) this;
        }

        public Criteria andCoSidGreaterThan(Integer value) {
            addCriterion("co_sid >", value, "coSid");
            return (Criteria) this;
        }

        public Criteria andCoSidGreaterThanOrEqualTo(Integer value) {
            addCriterion("co_sid >=", value, "coSid");
            return (Criteria) this;
        }

        public Criteria andCoSidLessThan(Integer value) {
            addCriterion("co_sid <", value, "coSid");
            return (Criteria) this;
        }

        public Criteria andCoSidLessThanOrEqualTo(Integer value) {
            addCriterion("co_sid <=", value, "coSid");
            return (Criteria) this;
        }

        public Criteria andCoSidIn(List<Integer> values) {
            addCriterion("co_sid in", values, "coSid");
            return (Criteria) this;
        }

        public Criteria andCoSidNotIn(List<Integer> values) {
            addCriterion("co_sid not in", values, "coSid");
            return (Criteria) this;
        }

        public Criteria andCoSidBetween(Integer value1, Integer value2) {
            addCriterion("co_sid between", value1, value2, "coSid");
            return (Criteria) this;
        }

        public Criteria andCoSidNotBetween(Integer value1, Integer value2) {
            addCriterion("co_sid not between", value1, value2, "coSid");
            return (Criteria) this;
        }

        public Criteria andCoUsidIsNull() {
            addCriterion("co_usid is null");
            return (Criteria) this;
        }

        public Criteria andCoUsidIsNotNull() {
            addCriterion("co_usid is not null");
            return (Criteria) this;
        }

        public Criteria andCoUsidEqualTo(Integer value) {
            addCriterion("co_usid =", value, "coUsid");
            return (Criteria) this;
        }

        public Criteria andCoUsidNotEqualTo(Integer value) {
            addCriterion("co_usid <>", value, "coUsid");
            return (Criteria) this;
        }

        public Criteria andCoUsidGreaterThan(Integer value) {
            addCriterion("co_usid >", value, "coUsid");
            return (Criteria) this;
        }

        public Criteria andCoUsidGreaterThanOrEqualTo(Integer value) {
            addCriterion("co_usid >=", value, "coUsid");
            return (Criteria) this;
        }

        public Criteria andCoUsidLessThan(Integer value) {
            addCriterion("co_usid <", value, "coUsid");
            return (Criteria) this;
        }

        public Criteria andCoUsidLessThanOrEqualTo(Integer value) {
            addCriterion("co_usid <=", value, "coUsid");
            return (Criteria) this;
        }

        public Criteria andCoUsidIn(List<Integer> values) {
            addCriterion("co_usid in", values, "coUsid");
            return (Criteria) this;
        }

        public Criteria andCoUsidNotIn(List<Integer> values) {
            addCriterion("co_usid not in", values, "coUsid");
            return (Criteria) this;
        }

        public Criteria andCoUsidBetween(Integer value1, Integer value2) {
            addCriterion("co_usid between", value1, value2, "coUsid");
            return (Criteria) this;
        }

        public Criteria andCoUsidNotBetween(Integer value1, Integer value2) {
            addCriterion("co_usid not between", value1, value2, "coUsid");
            return (Criteria) this;
        }

        public Criteria andCoaddtimeIsNull() {
            addCriterion("coaddtime is null");
            return (Criteria) this;
        }

        public Criteria andCoaddtimeIsNotNull() {
            addCriterion("coaddtime is not null");
            return (Criteria) this;
        }

        public Criteria andCoaddtimeEqualTo(Date value) {
            addCriterion("coaddtime =", value, "coaddtime");
            return (Criteria) this;
        }

        public Criteria andCoaddtimeNotEqualTo(Date value) {
            addCriterion("coaddtime <>", value, "coaddtime");
            return (Criteria) this;
        }

        public Criteria andCoaddtimeGreaterThan(Date value) {
            addCriterion("coaddtime >", value, "coaddtime");
            return (Criteria) this;
        }

        public Criteria andCoaddtimeGreaterThanOrEqualTo(Date value) {
            addCriterion("coaddtime >=", value, "coaddtime");
            return (Criteria) this;
        }

        public Criteria andCoaddtimeLessThan(Date value) {
            addCriterion("coaddtime <", value, "coaddtime");
            return (Criteria) this;
        }

        public Criteria andCoaddtimeLessThanOrEqualTo(Date value) {
            addCriterion("coaddtime <=", value, "coaddtime");
            return (Criteria) this;
        }

        public Criteria andCoaddtimeIn(List<Date> values) {
            addCriterion("coaddtime in", values, "coaddtime");
            return (Criteria) this;
        }

        public Criteria andCoaddtimeNotIn(List<Date> values) {
            addCriterion("coaddtime not in", values, "coaddtime");
            return (Criteria) this;
        }

        public Criteria andCoaddtimeBetween(Date value1, Date value2) {
            addCriterion("coaddtime between", value1, value2, "coaddtime");
            return (Criteria) this;
        }

        public Criteria andCoaddtimeNotBetween(Date value1, Date value2) {
            addCriterion("coaddtime not between", value1, value2, "coaddtime");
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