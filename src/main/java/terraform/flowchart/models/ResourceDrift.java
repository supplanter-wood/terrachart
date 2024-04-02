package terraform.flowchart.models;

import java.util.List;
import java.util.Map;

import terraform.flowchart.models.minorModels.*;



    public class ResourceDrift {

        private String address;
        private String mode;
        private String type;
        private String name;
        private String provider_name;
        private Change change;

        // Constructor, if needed

        public String getAddress() {
            return address;
        }

        public String getMode() {
            return mode;
        }

        public String getType() {
            return type;
        }

        public String getName() {
            return name;
        }

        public String getProviderName() {
            return provider_name;
        }

        public Change getChange() {
            return change;
        }

        // Inner class representing "change" in the JSON input
        public class Change {
            private List<String> actions;
            private Before before;
            private Map<String, Object> after_unknown;
            private BeforeSensitive before_sensitive;
            private boolean after_sensitive;

            public List<String> getActions() {
                return actions;
            }

            public Before getBefore() {
                return before;
            }

            public Map<String, Object> getAfter_unknown() {
                return after_unknown;
            }

            public BeforeSensitive getBefore_sensitive() {
                return before_sensitive;
            }

            public boolean isAfter_sensitive() {
                return after_sensitive;
            }

            public class Before {
                private boolean attach;
                private String bridge;
                private List<String> capabilities;
                private String cgroupns_mode;
                private List<String> command;
                private String container_logs;
                private int container_read_refresh_timeout_milliseconds;
                private String cpu_set;
                private int cpu_shares;
                private Integer destroy_grace_seconds;
                private List<String> devices;
                private String dns;
                private List<String> dns_opts;
                private List<String> dns_search;
                private String domainname;
                private List<String> entrypoint;
                private List<String> env;
                private Integer exit_code;
                private List<String> gpus;
                private List<String> group_add;
                private List<String> healthcheck;
                private List<String> host;
                private String hostname;
                private String id;
                private String image;
                private boolean init;
                private String ipc_mode;
                private List<String> labels;
                private String log_driver;
                private Map<String, String> log_opts;
                private boolean logs;
                private int max_retry_count;
                private int memory;
                private int memory_swap;
                private List<String> mounts;
                private boolean must_run;
                private String name;
                private List<NetworkData> network_data;
                private String network_mode;
                private List<String> networks_advanced;
                private String pid_mode;
                private List<ResourcePort> ports;
                private boolean privileged;
                private boolean publish_all_ports;
                private boolean read_only;
                private boolean remove_volumes;
                private String restart;
                private boolean rm;
                private String runtime;
                private List<String> security_opts;
                private int shm_size;
                private boolean start;
                private boolean stdin_open;
                private String stop_signal;
                private int stop_timeout;
                private Map<String, String> storage_opts;
                private Map<String, String> sysctls;
                private List<String> tmpfs;
                private boolean tty;
                private List<String> ulimit;
                private List<String> upload;
                private String user;
                private String userns_mode;
                private List<String> volumes;
                private boolean wait;
                private int wait_timeout;
                private String working_dir;

                public boolean isAttach() {
                    return attach;
                }

                public String getBridge() {
                    return bridge;
                }

                public List<String> getCapabilities() {
                    return capabilities;
                }

                public String getCgroupns_mode() {
                    return cgroupns_mode;
                }

                public List<String> getCommand() {
                    return command;
                }

                public String getContainer_logs() {
                    return container_logs;
                }

                public int getContainer_read_refresh_timeout_milliseconds() {
                    return container_read_refresh_timeout_milliseconds;
                }

                public String getCpu_set() {
                    return cpu_set;
                }

                public int getCpu_shares() {
                    return cpu_shares;
                }

                public Integer getDestroy_grace_seconds() {
                    return destroy_grace_seconds;
                }

                public List<String> getDevices() {
                    return devices;
                }

                public String getDns() {
                    return dns;
                }

                public List<String> getDns_opts() {
                    return dns_opts;
                }

                public List<String> getDns_search() {
                    return dns_search;
                }

                public String getDomainname() {
                    return domainname;
                }

                public List<String> getEntrypoint() {
                    return entrypoint;
                }

                public List<String> getEnv() {
                    return env;
                }

                public Integer getExit_code() {
                    return exit_code;
                }

                public List<String> getGpus() {
                    return gpus;
                }

                public List<String> getGroup_add() {
                    return group_add;
                }

                public List<String> getHealthcheck() {
                    return healthcheck;
                }

                public List<String> getHost() {
                    return host;
                }

                public String getHostname() {
                    return hostname;
                }

                public String getId() {
                    return id;
                }

                public String getImage() {
                    return image;
                }

                public boolean isInit() {
                    return init;
                }

                public String getIpc_mode() {
                    return ipc_mode;
                }

                public List<String> getLabels() {
                    return labels;
                }

                public String getLog_driver() {
                    return log_driver;
                }

                public Map<String, String> getLog_opts() {
                    return log_opts;
                }

                public boolean isLogs() {
                    return logs;
                }

                public int getMax_retry_count() {
                    return max_retry_count;
                }

                public int getMemory() {
                    return memory;
                }

                public int getMemory_swap() {
                    return memory_swap;
                }

                public List<String> getMounts() {
                    return mounts;
                }

                public boolean isMust_run() {
                    return must_run;
                }

                public String getName() {
                    return name;
                }

                public List<NetworkData> getNetwork_data() {
                    return network_data;
                }

                public String getNetwork_mode() {
                    return network_mode;
                }

                public List<String> getNetworks_advanced() {
                    return networks_advanced;
                }

                public String getPid_mode() {
                    return pid_mode;
                }

                public List<ResourcePort> getPorts() {
                    return ports;
                }

                public boolean isPrivileged() {
                    return privileged;
                }

                public boolean isPublish_all_ports() {
                    return publish_all_ports;
                }

                public boolean isRead_only() {
                    return read_only;
                }

                public boolean isRemove_volumes() {
                    return remove_volumes;
                }

                public String getRestart() {
                    return restart;
                }

                public boolean isRm() {
                    return rm;
                }

                public String getRuntime() {
                    return runtime;
                }

                public List<String> getSecurity_opts() {
                    return security_opts;
                }

                public int getShm_size() {
                    return shm_size;
                }

                public boolean isStart() {
                    return start;
                }

                public boolean isStdin_open() {
                    return stdin_open;
                }

                public String getStop_signal() {
                    return stop_signal;
                }

                public int getStop_timeout() {
                    return stop_timeout;
                }

                public Map<String, String> getStorage_opts() {
                    return storage_opts;
                }

                public Map<String, String> getSysctls() {
                    return sysctls;
                }

                public List<String> getTmpfs() {
                    return tmpfs;
                }

                public boolean isTty() {
                    return tty;
                }

                public List<String> getUlimit() {
                    return ulimit;
                }

                public List<String> getUpload() {
                    return upload;
                }

                public String getUser() {
                    return user;
                }

                public String getUserns_mode() {
                    return userns_mode;
                }

                public List<String> getVolumes() {
                    return volumes;
                }

                public boolean isWait() {
                    return wait;
                }

                public int getWait_timeout() {
                    return wait_timeout;
                }

                public String getWorking_dir() {
                    return working_dir;
                }

            }

        }

        public class BeforeSensitive {
            private List<Object> capabilities;
            private List<Boolean> command;
            private List<Object> devices;
            private List<Boolean> entrypoint;
            private List<Object> env;
            private List<Object> healthcheck;
            private List<Object> host;
            private List<Object> labels;
            private List<Object> mounts;
            private List<Map<String, NetworkData>> network_data;
            private List<Object> networks_advanced;
            private List<Map<String, ResourcePort>> ports;
            private List<Object> security_opts;
            private List<Object> ulimit;
            private List<Object> upload;
            private List<Object> volumes;

            public List<Object> getCapabilities() {
                return capabilities;
            }

            public List<Boolean> getCommand() {
                return command;
            }

            public List<Object> getDevices() {
                return devices;
            }

            public List<Boolean> getEntrypoint() {
                return entrypoint;
            }

            public List<Object> getEnv() {
                return env;
            }

            public List<Object> getHealthcheck() {
                return healthcheck;
            }

            public List<Object> getHost() {
                return host;
            }

            public List<Object> getLabels() {
                return labels;
            }

            public List<Object> getMounts() {
                return mounts;
            }

            public List<Map<String, NetworkData>> getNetwork_data() {
                return network_data;
            }

            public List<Object> getNetworks_advanced() {
                return networks_advanced;
            }

            public List<Map<String, ResourcePort>> getPorts() {
                return ports;
            }

            public List<Object> getSecurity_opts() {
                return security_opts;
            }

            public List<Object> getUlimit() {
                return ulimit;
            }

            public List<Object> getUpload() {
                return upload;
            }

            public List<Object> getVolumes() {
                return volumes;
            }
        }
    }
