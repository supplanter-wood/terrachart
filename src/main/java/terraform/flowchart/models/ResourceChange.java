package terraform.flowchart.models;

import java.util.List;
import java.util.Map;

import terraform.flowchart.models.minorModels.NetworkData;
import terraform.flowchart.models.minorModels.ResourcePort;

    public class ResourceChange {
        public String address;
        public String mode;
        public String type;
        public String name;
        public String provider_name;
        public Change change;

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

        public class Change {
            private List<String> actions;
            private After after;

            public List<String> getActions() {
                return actions;
            }

            // public boolean isBefore() {
            //     return before;
            // }

            public After getAfter() {
                return after;
            }

            // public boolean isBeforeSensitive() {
            //     return before_sensitive;
            // }

            public class After {
                private boolean attach;
                private List<String> capabilities;
                private String cgroupns_mode;
                private int container_read_refresh_timeout_milliseconds;
                private String cpu_set;
                private int cpu_shares;
                private Integer destroy_grace_seconds;
                private List<String> devices;
                private String dns;
                private List<String> dns_opts;
                private List<String> dns_search;
                private String domainname;
                private List<String> gpus;
                private List<String> group_add;
                private List<String> host;
                private String image;
                private Map<String, String> log_opts;
                private boolean logs;
                private int max_retry_count;
                private int memory;
                private int memory_swap;
                private List<String> mounts;
                private boolean must_run;
                private String name;
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
                private boolean start;
                private boolean stdin_open;
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

                public List<String> getCapabilities() {
                    return capabilities;
                }

                public String getCgroupns_mode() {
                    return cgroupns_mode;
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

                public List<String> getGpus() {
                    return gpus;
                }

                public List<String> getGroup_add() {
                    return group_add;
                }

                public List<String> getHost() {
                    return host;
                }

                public String getImage() {
                    return image;
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

                public boolean isStart() {
                    return start;
                }

                public boolean isStdin_open() {
                    return stdin_open;
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

            public class AfterUnknown {
                public boolean bridge;
                public List<String> capabilities;
                public boolean command;
                public boolean container_logs;
                public List<String> devices;
                public boolean entrypoint;
                public boolean env;
                public boolean exit_code;
                public boolean healthcheck;
                public List<String> host;
                public boolean hostname;
                public boolean id;
                public boolean init;
                public boolean ipc_mode;
                public boolean labels;
                public boolean log_driver;
                public List<String> mounts;
                public boolean network_data;
                public List<String> networks_advanced;
                public ResourcePort ports;
                public boolean runtime;
                public boolean security_opts;
                public boolean shm_size;
                public boolean stop_signal;
                public boolean stop_timeout;
                public List<String> ulimit;
                public List<String> upload;
                public List<String> volumes;

                public boolean isBridge() {
                    return bridge;
                }

                public List<String> getCapabilities() {
                    return capabilities;
                }

                public boolean isCommand() {
                    return command;
                }

                public boolean isContainerLogs() {
                    return container_logs;
                }

                public List<String> getDevices() {
                    return devices;
                }

                public boolean isEntryPoint() {
                    return entrypoint;
                }

                public boolean isEnv() {
                    return env;
                }

                public boolean isExitCode() {
                    return exit_code;
                }

                public boolean isHealthcheck() {
                    return healthcheck;
                }

                public List<String> host() {
                    return host;
                }

                public boolean isHostname() {
                    return hostname;
                }

                public boolean isID() {
                    return id;
                }

                public boolean isInit() {
                    return init;
                }

                public boolean isIPCMode() {
                    return ipc_mode;
                }

                public boolean isLabels() {
                    return labels;
                }

                public boolean isLogDriver() {
                    return log_driver;
                }

                public List<String> getNetworksAdvanced() {
                    return networks_advanced;
                }

                public ResourcePort getPorts() {
                    return ports;
                }

                public boolean isRuntime() {
                    return runtime;
                }

                public boolean isSecurityOpts() {
                    return security_opts;
                }

                public boolean isSHMSize() {
                    return shm_size;
                }

                public boolean isStopSignal() {
                    return stop_signal;
                }

                public boolean isStopTimeout() {
                    return stop_timeout;
                }

                public List<String> getULimit() {
                    return ulimit;
                }

                public List<String> getUpload() {
                    return upload;
                }

                public List<String> getVolumes() {
                    return volumes;
                }

            }

            public class AfterSensitive {
                private List<String> capabilities;
                private List<String> command;
                private List<String> devices;
                private List<String> entrypoint;
                private List<String> env;
                private List<String> healthcheck;
                private List<String> host;
                private List<String> labels;
                private List<String> mounts;
                private List<NetworkData> network_data;
                private List<String> networks_advanced;
                private List<ResourcePort> ports;
                private List<String> security_opts;
                private List<String> ulimit;
                private List<String> upload;
                private List<String> volumes;

                public List<String> getCapabilities() {
                    return capabilities;
                }

                public List<String> getCommand() {
                    return command;
                }

                public List<String> getDevices() {
                    return devices;
                }

                public List<String> getEntrypoint() {
                    return entrypoint;
                }

                public List<String> getEnv() {
                    return env;
                }

                public List<String> getHealthcheck() {
                    return healthcheck;
                }

                public List<String> getHost() {
                    return host;
                }

                public List<String> getLabels() {
                    return labels;
                }

                public List<String> getMounts() {
                    return mounts;
                }

                public List<NetworkData> getNetwork_data() {
                    return network_data;
                }

                public List<String> getNetworks_advanced() {
                    return networks_advanced;
                }

                public List<ResourcePort> getPorts() {
                    return ports;
                }

                public List<String> getSecurity_opts() {
                    return security_opts;
                }

                public List<String> getUlimit() {
                    return ulimit;
                }

                public List<String> getUpload() {
                    return upload;
                }

                public List<String> getVolumes() {
                    return volumes;
                }

            }

        }

        public class Change2 {
            private List<String> actions;
            private Before before;
            private After after;
            private Map<String, String> after_unknown;
            private BeforeSensitive before_sensitive;
            private AfterSensitive after_sensitive;

            public List<String> getActions() {
                return actions;
            }

            public Before getBefore() {
                return before;
            }

            public After getAfter() {
                return after;
            }

            public Map<String, String> getAfter_unknown() {
                return after_unknown;
            }

            public BeforeSensitive getBefore_sensitive() {
                return before_sensitive;
            }

            public AfterSensitive getAfter_sensitive() {
                return after_sensitive;
            }

            public class Before {
                private List<String> build;
                private String force_remove;
                private String id;
                private String image_id;
                private boolean keep_locally;
                private String name;
                private String platform;
                private String pull_triggers;
                private String repo_digest;
                private String triggers;

                public List<String> getBuild() {
                    return build;
                }

                public String getForce_remove() {
                    return force_remove;
                }

                public String getId() {
                    return id;
                }

                public String getImage_id() {
                    return image_id;
                }

                public boolean isKeep_locally() {
                    return keep_locally;
                }

                public String getName() {
                    return name;
                }

                public String getPlatform() {
                    return platform;
                }

                public String getPull_triggers() {
                    return pull_triggers;
                }

                public String getRepo_digest() {
                    return repo_digest;
                }

                public String getTriggers() {
                    return triggers;
                }
            }

            public class After {
                // Same as Before class
                private List<String> build;
                private String force_remove;
                private String id;
                private String image_id;
                private boolean keep_locally;
                private String name;
                private String platform;
                private String pull_triggers;
                private String repo_digest;
                private String triggers;

                public List<String> getBuild() {
                    return build;
                }

                public String getForce_remove() {
                    return force_remove;
                }

                public String getId() {
                    return id;
                }

                public String getImage_id() {
                    return image_id;
                }

                public boolean isKeep_locally() {
                    return keep_locally;
                }

                public String getName() {
                    return name;
                }

                public String getPlatform() {
                    return platform;
                }

                public String getPull_triggers() {
                    return pull_triggers;
                }

                public String getRepo_digest() {
                    return repo_digest;
                }

                public String getTriggers() {
                    return triggers;
                }
            }

            public class BeforeSensitive {
                private List<String> build;

                public List<String> getBuild() {
                    return build;
                }
            }

            public class AfterSensitive {
                private List<String> build;

                public List<String> getBuild() {
                    return build;
                }
            }
        }
    }

