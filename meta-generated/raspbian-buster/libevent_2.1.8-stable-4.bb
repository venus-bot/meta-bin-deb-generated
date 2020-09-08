PACKAGES = "${PN} libevent-2.1-6 libevent-core-2.1-6 libevent-dev libevent-extra-2.1-6 libevent-openssl-2.1-6 libevent-pthreads-2.1-6"
PROVIDES = "libevent-2.1-6 libevent-core-2.1-6 libevent-dev libevent-extra-2.1-6 libevent-openssl-2.1-6 libevent-pthreads-2.1-6"
SRC_URI = " \
	http://archive.raspbian.org/raspbian/pool/main/libe/libevent/libevent-2.1-6_2.1.8-stable-4_armhf.deb;unpack=0;name=deb0\
	http://archive.raspbian.org/raspbian/pool/main/libe/libevent/libevent-core-2.1-6_2.1.8-stable-4_armhf.deb;unpack=0;name=deb1\
	http://archive.raspbian.org/raspbian/pool/main/libe/libevent/libevent-dev_2.1.8-stable-4_armhf.deb;unpack=0;name=deb2\
	http://archive.raspbian.org/raspbian/pool/main/libe/libevent/libevent-extra-2.1-6_2.1.8-stable-4_armhf.deb;unpack=0;name=deb3\
	http://archive.raspbian.org/raspbian/pool/main/libe/libevent/libevent-openssl-2.1-6_2.1.8-stable-4_armhf.deb;unpack=0;name=deb4\
	http://archive.raspbian.org/raspbian/pool/main/libe/libevent/libevent-pthreads-2.1-6_2.1.8-stable-4_armhf.deb;unpack=0;name=deb5\
"
DEBFILENAME_libevent-2.1-6 = "libevent-2.1-6_2.1.8-stable-4_armhf.deb"
SRC_URI[deb0.sha256sum] = "b8bca67f980502877981d8891e751fa0bd879e785c63e2dd25b61ef629442adc"
SRC_URI[deb0.md5sum] = "2fdb13b3071f1db671b7ca4640de6f7f"
DEBFILENAME_libevent-core-2.1-6 = "libevent-core-2.1-6_2.1.8-stable-4_armhf.deb"
SRC_URI[deb1.sha256sum] = "24cd3b8e29650bd0e4b4efe6c1d770b1e75df9682c07eb3276fa22eb55276c44"
SRC_URI[deb1.md5sum] = "fa08ede4a6cdcd85114a07cd3dbd9845"
DEBFILENAME_libevent-dev = "libevent-dev_2.1.8-stable-4_armhf.deb"
SRC_URI[deb2.sha256sum] = "eb66a8712b62288ebc13a9240d69ebbd1b650e50599aa0073dc206cf7220a42d"
SRC_URI[deb2.md5sum] = "c2b62a8a4afd015e4e7fa4dcf11f240f"
DEBFILENAME_libevent-extra-2.1-6 = "libevent-extra-2.1-6_2.1.8-stable-4_armhf.deb"
SRC_URI[deb3.sha256sum] = "b93deb4add69d7bfe152b0498cc13c11a8ff38e870adcc411481485f4d66f0ea"
SRC_URI[deb3.md5sum] = "40c858b8dd0c5780002e2b4df50410b9"
DEBFILENAME_libevent-openssl-2.1-6 = "libevent-openssl-2.1-6_2.1.8-stable-4_armhf.deb"
SRC_URI[deb4.sha256sum] = "b38699a1b7e3ac97da4f04ba35fd08c42215487d07e38d02e1de38639dc153ce"
SRC_URI[deb4.md5sum] = "6e91fe43211ea8bd37b501c8d2c89739"
DEBFILENAME_libevent-pthreads-2.1-6 = "libevent-pthreads-2.1-6_2.1.8-stable-4_armhf.deb"
SRC_URI[deb5.sha256sum] = "cb009ff0d23de8d1de1972b712c210899fd5e4380027d9ac6846d5bb3b7e8c25"
SRC_URI[deb5.md5sum] = "ab667d4fe1bb8cc7dc37cc5bb36c0d80"

RDEPENDS_${PN}-2.1-6 = "libc6 (>= 2.17)"
RDEPENDS_${PN}-core-2.1-6 = "libc6 (>= 2.17)"
RDEPENDS_${PN}-dev = "libevent-2.1-6 (= 2.1.8-stable-4) libevent-core-2.1-6 (= 2.1.8-stable-4) libevent-extra-2.1-6 (= 2.1.8-stable-4) libevent-openssl-2.1-6 (= 2.1.8-stable-4) libevent-pthreads-2.1-6 (= 2.1.8-stable-4)"
RDEPENDS_${PN}-extra-2.1-6 = "libc6 (>= 2.4) libevent-core-2.1-6 (= 2.1.8-stable-4)"
RDEPENDS_${PN}-openssl-2.1-6 = "libc6 (>= 2.4) libevent-core-2.1-6 (= 2.1.8-stable-4) libssl1.1 (>= 1.1.0)"
RDEPENDS_${PN}-pthreads-2.1-6 = "libc6 (>= 2.4) libevent-core-2.1-6 (= 2.1.8-stable-4)"
DEPENDS = "libc6 libssl1.1"


inherit deb_group

FILES_libevent-2.1-6 = " \
    ./usr/lib/arm-linux-gnueabihf/libevent-2.1.so.6 \
    ./usr/lib/arm-linux-gnueabihf/libevent-2.1.so.6.0.2 \
    ./usr/share/doc/libevent-2.1-6/changelog.Debian.gz \
    ./usr/share/doc/libevent-2.1-6/changelog.gz \
    ./usr/share/doc/libevent-2.1-6/copyright\
"
FILES_libevent-core-2.1-6 = " \
    ./usr/lib/arm-linux-gnueabihf/libevent_core-2.1.so.6 \
    ./usr/lib/arm-linux-gnueabihf/libevent_core-2.1.so.6.0.2 \
    ./usr/share/doc/libevent-core-2.1-6/changelog.Debian.gz \
    ./usr/share/doc/libevent-core-2.1-6/changelog.gz \
    ./usr/share/doc/libevent-core-2.1-6/copyright\
"
FILES_${PN}-dev = " \
    ./usr/include/evdns.h \
    ./usr/include/event.h \
    ./usr/include/event2/buffer.h \
    ./usr/include/event2/buffer_compat.h \
    ./usr/include/event2/bufferevent.h \
    ./usr/include/event2/bufferevent_compat.h \
    ./usr/include/event2/bufferevent_ssl.h \
    ./usr/include/event2/bufferevent_struct.h \
    ./usr/include/event2/dns.h \
    ./usr/include/event2/dns_compat.h \
    ./usr/include/event2/dns_struct.h \
    ./usr/include/event2/event-config.h \
    ./usr/include/event2/event.h \
    ./usr/include/event2/event_compat.h \
    ./usr/include/event2/event_struct.h \
    ./usr/include/event2/http.h \
    ./usr/include/event2/http_compat.h \
    ./usr/include/event2/http_struct.h \
    ./usr/include/event2/keyvalq_struct.h \
    ./usr/include/event2/listener.h \
    ./usr/include/event2/rpc.h \
    ./usr/include/event2/rpc_compat.h \
    ./usr/include/event2/rpc_struct.h \
    ./usr/include/event2/tag.h \
    ./usr/include/event2/tag_compat.h \
    ./usr/include/event2/thread.h \
    ./usr/include/event2/util.h \
    ./usr/include/event2/visibility.h \
    ./usr/include/evhttp.h \
    ./usr/include/evrpc.h \
    ./usr/include/evutil.h \
    ./usr/lib/arm-linux-gnueabihf/libevent.a \
    ./usr/lib/arm-linux-gnueabihf/libevent.so \
    ./usr/lib/arm-linux-gnueabihf/libevent_core.a \
    ./usr/lib/arm-linux-gnueabihf/libevent_core.so \
    ./usr/lib/arm-linux-gnueabihf/libevent_extra.a \
    ./usr/lib/arm-linux-gnueabihf/libevent_extra.so \
    ./usr/lib/arm-linux-gnueabihf/libevent_openssl.a \
    ./usr/lib/arm-linux-gnueabihf/libevent_openssl.so \
    ./usr/lib/arm-linux-gnueabihf/libevent_pthreads.a \
    ./usr/lib/arm-linux-gnueabihf/libevent_pthreads.so \
    ./usr/lib/arm-linux-gnueabihf/pkgconfig/libevent.pc \
    ./usr/lib/arm-linux-gnueabihf/pkgconfig/libevent_core.pc \
    ./usr/lib/arm-linux-gnueabihf/pkgconfig/libevent_extra.pc \
    ./usr/lib/arm-linux-gnueabihf/pkgconfig/libevent_openssl.pc \
    ./usr/lib/arm-linux-gnueabihf/pkgconfig/libevent_pthreads.pc \
    ./usr/share/doc/libevent-dev/TODO.Debian \
    ./usr/share/doc/libevent-dev/changelog.Debian.gz \
    ./usr/share/doc/libevent-dev/changelog.gz \
    ./usr/share/doc/libevent-dev/copyright \
    ./usr/share/doc/libevent-dev/examples/Makefile.sample \
    ./usr/share/doc/libevent-dev/examples/dns-example.c.gz \
    ./usr/share/doc/libevent-dev/examples/event-read-fifo.c \
    ./usr/share/doc/libevent-dev/examples/hello-world.c \
    ./usr/share/doc/libevent-dev/examples/hostcheck.c.gz \
    ./usr/share/doc/libevent-dev/examples/http-connect.c \
    ./usr/share/doc/libevent-dev/examples/http-server.c.gz \
    ./usr/share/doc/libevent-dev/examples/https-client.c.gz \
    ./usr/share/doc/libevent-dev/examples/le-proxy.c.gz \
    ./usr/share/doc/libevent-dev/examples/openssl_hostname_validation.c.gz \
    ./usr/share/doc/libevent-dev/examples/signal-test.c \
    ./usr/share/doc/libevent-dev/examples/time-test.c \
    ./usr/share/doc/libevent-dev/whatsnew-2.0.txt.gz \
    ./usr/share/doc/libevent-dev/whatsnew-2.1.txt.gz\
"
FILES_libevent-extra-2.1-6 = " \
    ./usr/lib/arm-linux-gnueabihf/libevent_extra-2.1.so.6 \
    ./usr/lib/arm-linux-gnueabihf/libevent_extra-2.1.so.6.0.2 \
    ./usr/share/doc/libevent-extra-2.1-6/changelog.Debian.gz \
    ./usr/share/doc/libevent-extra-2.1-6/changelog.gz \
    ./usr/share/doc/libevent-extra-2.1-6/copyright\
"
FILES_libevent-openssl-2.1-6 = " \
    ./usr/lib/arm-linux-gnueabihf/libevent_openssl-2.1.so.6 \
    ./usr/lib/arm-linux-gnueabihf/libevent_openssl-2.1.so.6.0.2 \
    ./usr/share/doc/libevent-openssl-2.1-6/changelog.Debian.gz \
    ./usr/share/doc/libevent-openssl-2.1-6/changelog.gz \
    ./usr/share/doc/libevent-openssl-2.1-6/copyright\
"
FILES_libevent-pthreads-2.1-6 = " \
    ./usr/lib/arm-linux-gnueabihf/libevent_pthreads-2.1.so.6 \
    ./usr/lib/arm-linux-gnueabihf/libevent_pthreads-2.1.so.6.0.2 \
    ./usr/share/doc/libevent-pthreads-2.1-6/changelog.Debian.gz \
    ./usr/share/doc/libevent-pthreads-2.1-6/changelog.gz \
    ./usr/share/doc/libevent-pthreads-2.1-6/copyright\
"
