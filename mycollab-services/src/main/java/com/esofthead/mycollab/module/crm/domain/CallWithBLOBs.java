/**
 * This file is part of mycollab-services.
 *
 * mycollab-services is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * mycollab-services is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with mycollab-services.  If not, see <http://www.gnu.org/licenses/>.
 */
package com.esofthead.mycollab.module.crm.domain;

import com.esofthead.mycollab.core.db.metadata.Column;
import com.esofthead.mycollab.core.db.metadata.Table;
import org.hibernate.validator.constraints.Length;

@SuppressWarnings("ucd")
public class CallWithBLOBs extends Call {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column m_crm_call.description
     *
     * @mbggenerated Thu Sep 17 14:19:52 ICT 2015
     */
    @Length(max=65535, message="Field value is too long")
    @Column("description")
    private String description;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column m_crm_call.result
     *
     * @mbggenerated Thu Sep 17 14:19:52 ICT 2015
     */
    @Length(max=65535, message="Field value is too long")
    @Column("result")
    private String result;

    private static final long serialVersionUID = 1;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column m_crm_call.description
     *
     * @return the value of m_crm_call.description
     *
     * @mbggenerated Thu Sep 17 14:19:52 ICT 2015
     */
    public String getDescription() {
        return description;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column m_crm_call.description
     *
     * @param description the value for m_crm_call.description
     *
     * @mbggenerated Thu Sep 17 14:19:52 ICT 2015
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column m_crm_call.result
     *
     * @return the value of m_crm_call.result
     *
     * @mbggenerated Thu Sep 17 14:19:52 ICT 2015
     */
    public String getResult() {
        return result;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column m_crm_call.result
     *
     * @param result the value for m_crm_call.result
     *
     * @mbggenerated Thu Sep 17 14:19:52 ICT 2015
     */
    public void setResult(String result) {
        this.result = result;
    }

    public enum Field {
        id,
        subject,
        startdate,
        durationinseconds,
        calltype,
        type,
        typeid,
        lastupdatedtime,
        createdtime,
        createduser,
        assignuser,
        contactid,
        saccountid,
        status,
        purpose,
        isclosed,
        description,
        result;

        public boolean equalTo(Object value) {
            return name().equals(value);
        }
    }
}