package terraform.flowchart.models;

import java.util.List;

import com.google.gson.annotations.SerializedName;

import terraform.flowchart.models.minorModels.ResourcePort;


    public class PriorState  {
        private String format_version;
        private String terraform_version;
    
        public String getFormatVersion() {
            return format_version;
        }
    
        public String getTerraformVersion() {
            return terraform_version;
        }

        @SerializedName("values")
        private ValuesConfig values;
    
        // Getter for 'outputs'
        public ValuesConfig getValuesConfig() {
            return values;
        }
    

    public class ValuesConfig {
        private RootModule root_module;
        private ValuesOutput outputs;

        public ValuesOutput getValuesOutput() {
            return outputs;
        }

        public RootModule getRootModule() {
            return root_module;
        }
    }

    public class ValuesOutput {
        private ContainerId container_id;
        private ImageId image_id;
        private Name name;

        // Getter for 'container_id'
        public ContainerId getContainerId() {
            return container_id;
        }

        // Getter for 'image_id'
        public ImageId getImageId() {
            return image_id;
        }

        // Getter for 'name'
        public Name getName() {
            return name;
        }

        public class ContainerId {
            private boolean sensitive;
            private String value;
            private String type;

            // Getter for 'sensitive'
            public boolean isSensitive() {
                return sensitive;
            }

            public String getValue() {
                return value;
            }

            public String getType() {
                return type;
            }
        }

        public class ImageId {
            private boolean sensitive;
            private String type;
            private String value;

            // Getter for 'sensitive'
            public boolean isSensitive() {
                return sensitive;
            }

            // Getter for 'type'
            public String getType() {
                return type;
            }

            // Getter for 'value'
            public String getValue() {
                return value;
            }
        }

        public class Name {
            private boolean sensitive;
            private String type;
            private String value;

            // Getter for 'sensitive'
            public boolean isSensitive() {
                return sensitive;
            }

            // Getter for 'type'
            public String getType() {
                return type;
            }

            // Getter for 'value'
            public String getValue() {
                return value;
            }
        }
    }

    public class RootModule {
        private List<Resource> resources;

        // Getter for 'resources'
        public List<Resource> getResources() {
            return resources;
        }
    }

    public class Resource {
        private String address;
        private String mode;
        private String type;
        private String name;
        private String provider_name;
        private int schema_version;
        private resourceValues values;
        private SensitiveValues sensitive_values;

        // Getter for 'address'
        public String getAddress() {
            return address;
        }

        // Getter for 'mode'
        public String getMode() {
            return mode;
        }

        // Getter for 'type'
        public String getType() {
            return type;
        }

        // Getter for 'name'
        public String getName() {
            return name;
        }

        // Getter for 'provider_name'
        public String getProviderName() {
            return provider_name;
        }

        // Getter for 'schema_version'
        public int getSchemaVersion() {
            return schema_version;
        }

        // Getter for 'values'
        public resourceValues getValues() {
            return values;
        }

        // Getter for 'sensitive_values'
        public SensitiveValues getSensitiveValues() {
            return sensitive_values;
        }
    }

    public class SensitiveValues {
        private Object build;

        public Object getBuild() {
            return build;
        }

    }

    public class resourceValues {

                private List<String> build;
                private String force_remove;
                private String id;
                private String image_id;
                private boolean keep_locally;
                private String platform;
                private List<String> pull_triggers;
                private String repo_digest;
                private List<String> triggers;
                private boolean attach;
                private List<String> capabilities;
                private String cgroupns_mode;
                private Integer container_read_refresh_timeout_milliseconds;
                private String cpu_set;
                private Integer cpu_shares;
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
                private List<String> log_opts;
                private boolean logs;
                private Integer max_retry_count;
                private String memory;
                private String memory_swap;
                private List<String> mounts;
                private boolean must_run;
                private String name;
                private String network_mode;
                private List<String> networks_advanced;
                private String pid_mode;
                private List<ResourcePort> ports;
                private String privileged;
                private String publish_all_ports;
                private boolean read_only;
                private boolean remove_volumes;
                private String restart;
                private boolean rm;
                private boolean start;
                private boolean stdin_open;
                private List<String> storage_opts;
                private List<String> sysctls;
                private List<String> tmpfs;
                private boolean tty;
                private List<String> ulimit;
                private List<String> upload;
                private String user;
                private String userns_mode;
                private List<String> volumes;
                private boolean wait;
                private Integer wait_timeout;
                private String working_dir;

                // Getters for all variables
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

                public String getPlatform() {
                    return platform;
                }

                public List<String> getPull_triggers() {
                    return pull_triggers;
                }

                public String getRepo_digest() {
                    return repo_digest;
                }

                public List<String> getTriggers() {
                    return triggers;
                }

                public boolean isAttach() {
                    return attach;
                }

                public List<String> getCapabilities() {
                    return capabilities;
                }

                public String getCgroupns_mode() {
                    return cgroupns_mode;
                }

                public Integer getContainer_read_refresh_timeout_milliseconds() {
                    return container_read_refresh_timeout_milliseconds;
                }

                public String getCpu_set() {
                    return cpu_set;
                }

                public Integer getCpu_shares() {
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

                public List<String> getLog_opts() {
                    return log_opts;
                }

                public boolean isLogs() {
                    return logs;
                }

                public Integer getMax_retry_count() {
                    return max_retry_count;
                }

                public String getMemory() {
                    return memory;
                }

                public String getMemory_swap() {
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

                public String getPrivileged() {
                    return privileged;
                }

                public String getPublish_all_ports() {
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

                public List<String> getStorage_opts() {
                    return storage_opts;
                }

                public List<String> getSysctls() {
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

                public Integer getWait_timeout() {
                    return wait_timeout;
                }

                public String getWorking_dir() {
                    return working_dir;
                }
            }
}
