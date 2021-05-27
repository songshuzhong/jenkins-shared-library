package com.shuzhong

class Utils implements Serializable {
  def createVersion(String BUILD_NUMBER) {
    return new Date().format('yyyMM') + "-${BUILD_NUMBER}"
  }
}
