package android.example.com.split.data.entity;

import android.example.com.split.data.model.Payment;

import java.io.Serializable;

/**
 * Share
 */
public class Share implements Payment, Serializable {

  private String id;
  private String userId;
  private String memberName;
  // Total amount paid by user
  private double paidAmount;
  // Total share per member
  private double totalShare;
  // amount is settled
  private boolean isSetteled;

  public Share() {
    this.isSetteled = false;
  }

  public Share(String id, String userId, String memberName, double paidAmount, double
      totalShare) {
    this.id = id;
    this.userId = userId;
    this.memberName = memberName;
    this.paidAmount = paidAmount;
    this.totalShare = totalShare;
    this.isSetteled = false;
  }

  public String getId() {

    return id;
  }


  public void setId(String id) {
    this.id = id;
  }

  @Override
  public void setSetteled(boolean setteled) {
    this.isSetteled = setteled;
  }


  public String getMemberName() {
    return memberName;
  }

  public void setMemberName(String memberName) {
    this.memberName = memberName;
  }

  /**
   * Set share is paid
   *
   */
  @Override
  public void setPaidAmount(double paidAmount) {
    this.paidAmount = paidAmount;
  }

  @Override
  public double getPaidAmount() {
    return paidAmount;
  }

  /**
   * Get share amount
   *
   * @return double the amount of the share
   */
  @Override
  public double getTotalShare() {
    return totalShare;
  }

  /**
   * Set share amount
   *
   * @param totalShare Set the share amount
   */
  @Override
  public void setTotalShare(double totalShare) {
    this.totalShare = totalShare;
  }


  /**
   * Get user ID
   *
   * @return Get the {@link User} the ID
   */
  public String getUserId() {
    return userId;
  }

  /**
   * Set user ID
   *
   * @param userId Set the {@link User} ID
   */
  public void setUserId(String userId) {
    this.userId = userId;
  }

}
