target: kii-iot

apache-apollo-1.7-unix-distro.tar.gz:
	curl -L -O http://ftp.yz.yamagata-u.ac.jp/pub/network/apache/activemq/activemq-apollo/1.7/apache-apollo-1.7-unix-distro.tar.gz

apache-apollo-1.7-unix-distro: apache-apollo-1.7-unix-distro.tar.gz
	tar zxvf apache-apollo-1.7-unix-distro.tar.gz

apache-apollo: apache-apollo-1.7-unix-distro
	ln -s apache-apollo-1.7 apache-apollo

kii-iot: apache-apollo
	(cd apache-apollo; bin/apollo create kii-iot)
	#kii-iot/etc/apollo.xml

