mqtt
====
```
$ curl -L -O http://ftp.yz.yamagata-u.ac.jp/pub/network/apache/activemq/activemq-apollo/1.7/apache-apollo-1.7-unix-distro.tar.gz
$ tar zxvf apache-apollo-1.7-unix-distro.tar.gz
$ ln -s apache-apollo-1.7 apache-apollo
$ cd apache-apollo
$ bin/apollo create kii-iot
$ kii-iot/bin/apollo-broker run

    _____                .__  .__
   /  _  \ ______   ____ |  | |  |   ____
  /  /_\  \\____ \ /  _ \|  | |  |  /  _ \
 /    |    \  |_> >  <_> )  |_|  |_(  <_> )
 \____|__  /   __/ \____/|____/____/\____/
         \/|__|  Apache Apollo (1.7)


Loading configuration file '/home/hafizur/apache-apollo/kii-iot/etc/apollo.xml'.
INFO  | OS     : Linux 2.6.32-431.17.1.el6.x86_64 ("CentOS release 6.5 (Final)")
INFO  | JVM    : OpenJDK 64-Bit Server VM 1.7.0_55 (Oracle Corporation)
INFO  | Apollo : 1.7 (at: /home/hafizur/apache-apollo-1.7)
INFO  | OS is restricting the open file limit to: 3125
WARN  | Please increase the process file limit using 'ulimit -n 8500' or configure lower connection limits on the broker connectors.
INFO  | Starting store: leveldb store at /home/hafizur/apache-apollo/kii-iot/data
INFO  | Accepting connections at: tcp://0.0.0.0:61613
INFO  | Accepting connections at: tls://0.0.0.0:61614
INFO  | Accepting connections at: ws://0.0.0.0:61623/
INFO  | Accepting connections at: wss://0.0.0.0:61624/
INFO  | Administration interface available at: https://127.0.0.1:61681/
INFO  | Administration interface available at: http://127.0.0.1:61680/
```

