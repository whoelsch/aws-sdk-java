/*
 * Copyright 2014-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"). You may not use this file except in compliance with
 * the License. A copy of the License is located at
 * 
 * http://aws.amazon.com/apache2.0
 * 
 * or in the "license" file accompanying this file. This file is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR
 * CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions
 * and limitations under the License.
 */
package com.amazonaws.services.directconnect.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Information about an association between a Direct Connect gateway and a virtual private gateway.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/directconnect-2012-10-25/DirectConnectGatewayAssociation"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DirectConnectGatewayAssociation implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The ID of the Direct Connect gateway.
     * </p>
     */
    private String directConnectGatewayId;
    /**
     * <p>
     * The ID of the virtual private gateway. Applies only to private virtual interfaces.
     * </p>
     */
    private String virtualGatewayId;
    /**
     * <p>
     * The AWS Region where the virtual private gateway is located.
     * </p>
     */
    private String virtualGatewayRegion;
    /**
     * <p>
     * The ID of the AWS account that owns the virtual private gateway.
     * </p>
     */
    private String virtualGatewayOwnerAccount;
    /**
     * <p>
     * The state of the association. The following are the possible values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>associating</code>: The initial state after calling <a>CreateDirectConnectGatewayAssociation</a>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>associated</code>: The Direct Connect gateway and virtual private gateway are successfully associated and
     * ready to pass traffic.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>disassociating</code>: The initial state after calling <a>DeleteDirectConnectGatewayAssociation</a>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>disassociated</code>: The virtual private gateway is disassociated from the Direct Connect gateway. Traffic
     * flow between the Direct Connect gateway and virtual private gateway is stopped.
     * </p>
     * </li>
     * </ul>
     */
    private String associationState;
    /**
     * <p>
     * The error message if the state of an object failed to advance.
     * </p>
     */
    private String stateChangeError;

    /**
     * <p>
     * The ID of the Direct Connect gateway.
     * </p>
     * 
     * @param directConnectGatewayId
     *        The ID of the Direct Connect gateway.
     */

    public void setDirectConnectGatewayId(String directConnectGatewayId) {
        this.directConnectGatewayId = directConnectGatewayId;
    }

    /**
     * <p>
     * The ID of the Direct Connect gateway.
     * </p>
     * 
     * @return The ID of the Direct Connect gateway.
     */

    public String getDirectConnectGatewayId() {
        return this.directConnectGatewayId;
    }

    /**
     * <p>
     * The ID of the Direct Connect gateway.
     * </p>
     * 
     * @param directConnectGatewayId
     *        The ID of the Direct Connect gateway.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DirectConnectGatewayAssociation withDirectConnectGatewayId(String directConnectGatewayId) {
        setDirectConnectGatewayId(directConnectGatewayId);
        return this;
    }

    /**
     * <p>
     * The ID of the virtual private gateway. Applies only to private virtual interfaces.
     * </p>
     * 
     * @param virtualGatewayId
     *        The ID of the virtual private gateway. Applies only to private virtual interfaces.
     */

    public void setVirtualGatewayId(String virtualGatewayId) {
        this.virtualGatewayId = virtualGatewayId;
    }

    /**
     * <p>
     * The ID of the virtual private gateway. Applies only to private virtual interfaces.
     * </p>
     * 
     * @return The ID of the virtual private gateway. Applies only to private virtual interfaces.
     */

    public String getVirtualGatewayId() {
        return this.virtualGatewayId;
    }

    /**
     * <p>
     * The ID of the virtual private gateway. Applies only to private virtual interfaces.
     * </p>
     * 
     * @param virtualGatewayId
     *        The ID of the virtual private gateway. Applies only to private virtual interfaces.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DirectConnectGatewayAssociation withVirtualGatewayId(String virtualGatewayId) {
        setVirtualGatewayId(virtualGatewayId);
        return this;
    }

    /**
     * <p>
     * The AWS Region where the virtual private gateway is located.
     * </p>
     * 
     * @param virtualGatewayRegion
     *        The AWS Region where the virtual private gateway is located.
     */

    public void setVirtualGatewayRegion(String virtualGatewayRegion) {
        this.virtualGatewayRegion = virtualGatewayRegion;
    }

    /**
     * <p>
     * The AWS Region where the virtual private gateway is located.
     * </p>
     * 
     * @return The AWS Region where the virtual private gateway is located.
     */

    public String getVirtualGatewayRegion() {
        return this.virtualGatewayRegion;
    }

    /**
     * <p>
     * The AWS Region where the virtual private gateway is located.
     * </p>
     * 
     * @param virtualGatewayRegion
     *        The AWS Region where the virtual private gateway is located.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DirectConnectGatewayAssociation withVirtualGatewayRegion(String virtualGatewayRegion) {
        setVirtualGatewayRegion(virtualGatewayRegion);
        return this;
    }

    /**
     * <p>
     * The ID of the AWS account that owns the virtual private gateway.
     * </p>
     * 
     * @param virtualGatewayOwnerAccount
     *        The ID of the AWS account that owns the virtual private gateway.
     */

    public void setVirtualGatewayOwnerAccount(String virtualGatewayOwnerAccount) {
        this.virtualGatewayOwnerAccount = virtualGatewayOwnerAccount;
    }

    /**
     * <p>
     * The ID of the AWS account that owns the virtual private gateway.
     * </p>
     * 
     * @return The ID of the AWS account that owns the virtual private gateway.
     */

    public String getVirtualGatewayOwnerAccount() {
        return this.virtualGatewayOwnerAccount;
    }

    /**
     * <p>
     * The ID of the AWS account that owns the virtual private gateway.
     * </p>
     * 
     * @param virtualGatewayOwnerAccount
     *        The ID of the AWS account that owns the virtual private gateway.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DirectConnectGatewayAssociation withVirtualGatewayOwnerAccount(String virtualGatewayOwnerAccount) {
        setVirtualGatewayOwnerAccount(virtualGatewayOwnerAccount);
        return this;
    }

    /**
     * <p>
     * The state of the association. The following are the possible values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>associating</code>: The initial state after calling <a>CreateDirectConnectGatewayAssociation</a>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>associated</code>: The Direct Connect gateway and virtual private gateway are successfully associated and
     * ready to pass traffic.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>disassociating</code>: The initial state after calling <a>DeleteDirectConnectGatewayAssociation</a>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>disassociated</code>: The virtual private gateway is disassociated from the Direct Connect gateway. Traffic
     * flow between the Direct Connect gateway and virtual private gateway is stopped.
     * </p>
     * </li>
     * </ul>
     * 
     * @param associationState
     *        The state of the association. The following are the possible values:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>associating</code>: The initial state after calling <a>CreateDirectConnectGatewayAssociation</a>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>associated</code>: The Direct Connect gateway and virtual private gateway are successfully
     *        associated and ready to pass traffic.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>disassociating</code>: The initial state after calling <a>DeleteDirectConnectGatewayAssociation</a>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>disassociated</code>: The virtual private gateway is disassociated from the Direct Connect gateway.
     *        Traffic flow between the Direct Connect gateway and virtual private gateway is stopped.
     *        </p>
     *        </li>
     * @see DirectConnectGatewayAssociationState
     */

    public void setAssociationState(String associationState) {
        this.associationState = associationState;
    }

    /**
     * <p>
     * The state of the association. The following are the possible values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>associating</code>: The initial state after calling <a>CreateDirectConnectGatewayAssociation</a>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>associated</code>: The Direct Connect gateway and virtual private gateway are successfully associated and
     * ready to pass traffic.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>disassociating</code>: The initial state after calling <a>DeleteDirectConnectGatewayAssociation</a>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>disassociated</code>: The virtual private gateway is disassociated from the Direct Connect gateway. Traffic
     * flow between the Direct Connect gateway and virtual private gateway is stopped.
     * </p>
     * </li>
     * </ul>
     * 
     * @return The state of the association. The following are the possible values:</p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>associating</code>: The initial state after calling <a>CreateDirectConnectGatewayAssociation</a>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>associated</code>: The Direct Connect gateway and virtual private gateway are successfully
     *         associated and ready to pass traffic.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>disassociating</code>: The initial state after calling
     *         <a>DeleteDirectConnectGatewayAssociation</a>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>disassociated</code>: The virtual private gateway is disassociated from the Direct Connect gateway.
     *         Traffic flow between the Direct Connect gateway and virtual private gateway is stopped.
     *         </p>
     *         </li>
     * @see DirectConnectGatewayAssociationState
     */

    public String getAssociationState() {
        return this.associationState;
    }

    /**
     * <p>
     * The state of the association. The following are the possible values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>associating</code>: The initial state after calling <a>CreateDirectConnectGatewayAssociation</a>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>associated</code>: The Direct Connect gateway and virtual private gateway are successfully associated and
     * ready to pass traffic.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>disassociating</code>: The initial state after calling <a>DeleteDirectConnectGatewayAssociation</a>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>disassociated</code>: The virtual private gateway is disassociated from the Direct Connect gateway. Traffic
     * flow between the Direct Connect gateway and virtual private gateway is stopped.
     * </p>
     * </li>
     * </ul>
     * 
     * @param associationState
     *        The state of the association. The following are the possible values:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>associating</code>: The initial state after calling <a>CreateDirectConnectGatewayAssociation</a>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>associated</code>: The Direct Connect gateway and virtual private gateway are successfully
     *        associated and ready to pass traffic.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>disassociating</code>: The initial state after calling <a>DeleteDirectConnectGatewayAssociation</a>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>disassociated</code>: The virtual private gateway is disassociated from the Direct Connect gateway.
     *        Traffic flow between the Direct Connect gateway and virtual private gateway is stopped.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see DirectConnectGatewayAssociationState
     */

    public DirectConnectGatewayAssociation withAssociationState(String associationState) {
        setAssociationState(associationState);
        return this;
    }

    /**
     * <p>
     * The state of the association. The following are the possible values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>associating</code>: The initial state after calling <a>CreateDirectConnectGatewayAssociation</a>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>associated</code>: The Direct Connect gateway and virtual private gateway are successfully associated and
     * ready to pass traffic.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>disassociating</code>: The initial state after calling <a>DeleteDirectConnectGatewayAssociation</a>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>disassociated</code>: The virtual private gateway is disassociated from the Direct Connect gateway. Traffic
     * flow between the Direct Connect gateway and virtual private gateway is stopped.
     * </p>
     * </li>
     * </ul>
     * 
     * @param associationState
     *        The state of the association. The following are the possible values:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>associating</code>: The initial state after calling <a>CreateDirectConnectGatewayAssociation</a>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>associated</code>: The Direct Connect gateway and virtual private gateway are successfully
     *        associated and ready to pass traffic.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>disassociating</code>: The initial state after calling <a>DeleteDirectConnectGatewayAssociation</a>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>disassociated</code>: The virtual private gateway is disassociated from the Direct Connect gateway.
     *        Traffic flow between the Direct Connect gateway and virtual private gateway is stopped.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see DirectConnectGatewayAssociationState
     */

    public DirectConnectGatewayAssociation withAssociationState(DirectConnectGatewayAssociationState associationState) {
        this.associationState = associationState.toString();
        return this;
    }

    /**
     * <p>
     * The error message if the state of an object failed to advance.
     * </p>
     * 
     * @param stateChangeError
     *        The error message if the state of an object failed to advance.
     */

    public void setStateChangeError(String stateChangeError) {
        this.stateChangeError = stateChangeError;
    }

    /**
     * <p>
     * The error message if the state of an object failed to advance.
     * </p>
     * 
     * @return The error message if the state of an object failed to advance.
     */

    public String getStateChangeError() {
        return this.stateChangeError;
    }

    /**
     * <p>
     * The error message if the state of an object failed to advance.
     * </p>
     * 
     * @param stateChangeError
     *        The error message if the state of an object failed to advance.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DirectConnectGatewayAssociation withStateChangeError(String stateChangeError) {
        setStateChangeError(stateChangeError);
        return this;
    }

    /**
     * Returns a string representation of this object. This is useful for testing and debugging. Sensitive data will be
     * redacted from this string using a placeholder value.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getDirectConnectGatewayId() != null)
            sb.append("DirectConnectGatewayId: ").append(getDirectConnectGatewayId()).append(",");
        if (getVirtualGatewayId() != null)
            sb.append("VirtualGatewayId: ").append(getVirtualGatewayId()).append(",");
        if (getVirtualGatewayRegion() != null)
            sb.append("VirtualGatewayRegion: ").append(getVirtualGatewayRegion()).append(",");
        if (getVirtualGatewayOwnerAccount() != null)
            sb.append("VirtualGatewayOwnerAccount: ").append(getVirtualGatewayOwnerAccount()).append(",");
        if (getAssociationState() != null)
            sb.append("AssociationState: ").append(getAssociationState()).append(",");
        if (getStateChangeError() != null)
            sb.append("StateChangeError: ").append(getStateChangeError());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DirectConnectGatewayAssociation == false)
            return false;
        DirectConnectGatewayAssociation other = (DirectConnectGatewayAssociation) obj;
        if (other.getDirectConnectGatewayId() == null ^ this.getDirectConnectGatewayId() == null)
            return false;
        if (other.getDirectConnectGatewayId() != null && other.getDirectConnectGatewayId().equals(this.getDirectConnectGatewayId()) == false)
            return false;
        if (other.getVirtualGatewayId() == null ^ this.getVirtualGatewayId() == null)
            return false;
        if (other.getVirtualGatewayId() != null && other.getVirtualGatewayId().equals(this.getVirtualGatewayId()) == false)
            return false;
        if (other.getVirtualGatewayRegion() == null ^ this.getVirtualGatewayRegion() == null)
            return false;
        if (other.getVirtualGatewayRegion() != null && other.getVirtualGatewayRegion().equals(this.getVirtualGatewayRegion()) == false)
            return false;
        if (other.getVirtualGatewayOwnerAccount() == null ^ this.getVirtualGatewayOwnerAccount() == null)
            return false;
        if (other.getVirtualGatewayOwnerAccount() != null && other.getVirtualGatewayOwnerAccount().equals(this.getVirtualGatewayOwnerAccount()) == false)
            return false;
        if (other.getAssociationState() == null ^ this.getAssociationState() == null)
            return false;
        if (other.getAssociationState() != null && other.getAssociationState().equals(this.getAssociationState()) == false)
            return false;
        if (other.getStateChangeError() == null ^ this.getStateChangeError() == null)
            return false;
        if (other.getStateChangeError() != null && other.getStateChangeError().equals(this.getStateChangeError()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDirectConnectGatewayId() == null) ? 0 : getDirectConnectGatewayId().hashCode());
        hashCode = prime * hashCode + ((getVirtualGatewayId() == null) ? 0 : getVirtualGatewayId().hashCode());
        hashCode = prime * hashCode + ((getVirtualGatewayRegion() == null) ? 0 : getVirtualGatewayRegion().hashCode());
        hashCode = prime * hashCode + ((getVirtualGatewayOwnerAccount() == null) ? 0 : getVirtualGatewayOwnerAccount().hashCode());
        hashCode = prime * hashCode + ((getAssociationState() == null) ? 0 : getAssociationState().hashCode());
        hashCode = prime * hashCode + ((getStateChangeError() == null) ? 0 : getStateChangeError().hashCode());
        return hashCode;
    }

    @Override
    public DirectConnectGatewayAssociation clone() {
        try {
            return (DirectConnectGatewayAssociation) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.directconnect.model.transform.DirectConnectGatewayAssociationMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
