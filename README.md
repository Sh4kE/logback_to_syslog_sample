# logback_to_syslog_sample
This is a sample project for how to log via java's logback to syslog


# Prerequirements

* You need to have a running instance of syslog with an open UDP port 514
* You need to have gradle installed on your system

# Usage
You can simply clone and run it with `gradle run`, which should send a message to your local syslog server.

# Sample Configuration for syslog-ng

There is a sample config file for syslog-ng in the config folder, which listens on UDP port 514 for incoming syslog messages and forwards them to a graylog instance.
