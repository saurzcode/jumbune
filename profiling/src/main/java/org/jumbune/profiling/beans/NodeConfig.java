package org.jumbune.profiling.beans;

public interface NodeConfig {
  void setNodeIp(String nodeIp);

  String getNodeIp();

  CategoryInfo getFavourities();

  CategoryInfo getTrends();
}
