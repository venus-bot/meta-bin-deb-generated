PACKAGES = "${PN} libevent-2.0-5 libevent-core-2.0-5 libevent-dev libevent-extra-2.0-5 libevent-openssl-2.0-5 libevent-pthreads-2.0-5"
PROVIDES = "libevent-2.0-5 libevent-core-2.0-5 libevent-dev libevent-extra-2.0-5 libevent-openssl-2.0-5 libevent-pthreads-2.0-5"
SRC_URI = " \
	http://ftp.de.debian.org/debian/pool/main/libe/libevent/libevent-2.0-5_2.0.21-stable-2+deb8u1_armhf.deb;unpack=0;name=deb0\
	http://ftp.de.debian.org/debian/pool/main/libe/libevent/libevent-core-2.0-5_2.0.21-stable-2+deb8u1_armhf.deb;unpack=0;name=deb1\
	http://ftp.de.debian.org/debian/pool/main/libe/libevent/libevent-dev_2.0.21-stable-2+deb8u1_armhf.deb;unpack=0;name=deb2\
	http://ftp.de.debian.org/debian/pool/main/libe/libevent/libevent-extra-2.0-5_2.0.21-stable-2+deb8u1_armhf.deb;unpack=0;name=deb3\
	http://ftp.de.debian.org/debian/pool/main/libe/libevent/libevent-openssl-2.0-5_2.0.21-stable-2+deb8u1_armhf.deb;unpack=0;name=deb4\
	http://ftp.de.debian.org/debian/pool/main/libe/libevent/libevent-pthreads-2.0-5_2.0.21-stable-2+deb8u1_armhf.deb;unpack=0;name=deb5\
"
DEBFILENAME_libevent-2.0-5 = "libevent-2.0-5_2.0.21-stable-2+deb8u1_armhf.deb"
SRC_URI[deb0.sha256sum] = "a03815bcf4520813dbad2a9ecccaadef7124f56aa95291e5f21f9c8fecad43e7"
SRC_URI[deb0.md5sum] = "42fa599279e940e69192a0c219a6ac72"
DEBFILENAME_libevent-core-2.0-5 = "libevent-core-2.0-5_2.0.21-stable-2+deb8u1_armhf.deb"
SRC_URI[deb1.sha256sum] = "18523545e15eb7502fbb12c5cde83fd4274a5dc029e9d248b5e717d14d2d106c"
SRC_URI[deb1.md5sum] = "6905c7dc80de9a48fbbd933347805f60"
DEBFILENAME_libevent-dev = "libevent-dev_2.0.21-stable-2+deb8u1_armhf.deb"
SRC_URI[deb2.sha256sum] = "191ff6b43f6b8d850bb95d37894f8003330d3f8f03eb1dd5d4112f657f960605"
SRC_URI[deb2.md5sum] = "11daa9668d130fdc07a8377a8803ea3a"
DEBFILENAME_libevent-extra-2.0-5 = "libevent-extra-2.0-5_2.0.21-stable-2+deb8u1_armhf.deb"
SRC_URI[deb3.sha256sum] = "e7a60301554f500de5c3767af8a963192100db15e2dcc8ada5039637c348607f"
SRC_URI[deb3.md5sum] = "2ea8a526b7fc7abd06ac6ecdf618d73a"
DEBFILENAME_libevent-openssl-2.0-5 = "libevent-openssl-2.0-5_2.0.21-stable-2+deb8u1_armhf.deb"
SRC_URI[deb4.sha256sum] = "768df452e43c0c1bb13286918ff88179ab1191cc39eaac3555bd887e3a184bc2"
SRC_URI[deb4.md5sum] = "8567c1a1048db1d9ab505106cdd4b899"
DEBFILENAME_libevent-pthreads-2.0-5 = "libevent-pthreads-2.0-5_2.0.21-stable-2+deb8u1_armhf.deb"
SRC_URI[deb5.sha256sum] = "a90e5030900119f5cf7cec6aac32c638f57452f097c16d068356519d47f05afc"
SRC_URI[deb5.md5sum] = "a9cf3602f1daf8ce5e826313605d8fd4"

RDEPENDS_${PN}-2.0-5 = "libc6 (>= 2.17)"
RDEPENDS_${PN}-core-2.0-5 = "libc6 (>= 2.17)"
RDEPENDS_${PN}-dev = "libevent-2.0-5 (= 2.0.21-stable-2+deb8u1) libevent-core-2.0-5 (= 2.0.21-stable-2+deb8u1) libevent-extra-2.0-5 (= 2.0.21-stable-2+deb8u1) libevent-pthreads-2.0-5 (= 2.0.21-stable-2+deb8u1) libevent-openssl-2.0-5 (= 2.0.21-stable-2+deb8u1)"
RDEPENDS_${PN}-extra-2.0-5 = "libc6 (>= 2.7) libevent-core-2.0-5 (= 2.0.21-stable-2+deb8u1)"
RDEPENDS_${PN}-openssl-2.0-5 = "libc6 (>= 2.4) libevent-core-2.0-5 (= 2.0.21-stable-2+deb8u1) libssl1.0.0 (>= 1.0.0)"
RDEPENDS_${PN}-pthreads-2.0-5 = "libc6 (>= 2.4) libevent-core-2.0-5 (= 2.0.21-stable-2+deb8u1)"
DEPENDS = "libssl1.0.0 libc6"


inherit deb_group

# Prebuilt binaries, no need for any default dependencies
INHIBIT_DEFAULT_DEPS = "1"
INHIBIT_PACKAGE_STRIP = "1"
INSANE_SKIP_${PN} += "already-stripped"

FILES_libevent-2.0-5 = " \
    ./usr/lib/arm-linux-gnueabihf/libevent-2.0.so.5 \
    ./usr/lib/arm-linux-gnueabihf/libevent-2.0.so.5.1.9 \
    ./usr/share/doc/libevent-2.0-5/changelog.Debian.gz \
    ./usr/share/doc/libevent-2.0-5/changelog.gz \
    ./usr/share/doc/libevent-2.0-5/copyright\
"
FILES_libevent-core-2.0-5 = " \
    ./usr/lib/arm-linux-gnueabihf/libevent_core-2.0.so.5 \
    ./usr/lib/arm-linux-gnueabihf/libevent_core-2.0.so.5.1.9 \
    ./usr/share/doc/libevent-core-2.0-5/changelog.Debian.gz \
    ./usr/share/doc/libevent-core-2.0-5/changelog.gz \
    ./usr/share/doc/libevent-core-2.0-5/copyright\
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
    ./usr/lib/arm-linux-gnueabihf/pkgconfig/libevent_openssl.pc \
    ./usr/lib/arm-linux-gnueabihf/pkgconfig/libevent_pthreads.pc \
    ./usr/share/doc/libevent-dev/TODO.Debian \
    ./usr/share/doc/libevent-dev/changelog.Debian.gz \
    ./usr/share/doc/libevent-dev/changelog.gz \
    ./usr/share/doc/libevent-dev/copyright \
    ./usr/share/doc/libevent-dev/examples/Makefile.sample \
    ./usr/share/doc/libevent-dev/examples/dns-example.c.gz \
    ./usr/share/doc/libevent-dev/examples/event-test.c \
    ./usr/share/doc/libevent-dev/examples/hello-world.c \
    ./usr/share/doc/libevent-dev/examples/http-server.c.gz \
    ./usr/share/doc/libevent-dev/examples/le-proxy.c.gz \
    ./usr/share/doc/libevent-dev/examples/signal-test.c \
    ./usr/share/doc/libevent-dev/examples/time-test.c \
    ./usr/share/doc/libevent-dev/whatsnew-2.0.txt.gz\
"
FILES_libevent-extra-2.0-5 = " \
    ./usr/lib/arm-linux-gnueabihf/libevent_extra-2.0.so.5 \
    ./usr/lib/arm-linux-gnueabihf/libevent_extra-2.0.so.5.1.9 \
    ./usr/share/doc/libevent-extra-2.0-5/changelog.Debian.gz \
    ./usr/share/doc/libevent-extra-2.0-5/changelog.gz \
    ./usr/share/doc/libevent-extra-2.0-5/copyright\
"
FILES_libevent-openssl-2.0-5 = " \
    ./usr/lib/arm-linux-gnueabihf/libevent_openssl-2.0.so.5 \
    ./usr/lib/arm-linux-gnueabihf/libevent_openssl-2.0.so.5.1.9 \
    ./usr/share/doc/libevent-openssl-2.0-5/changelog.Debian.gz \
    ./usr/share/doc/libevent-openssl-2.0-5/changelog.gz \
    ./usr/share/doc/libevent-openssl-2.0-5/copyright\
"
FILES_libevent-pthreads-2.0-5 = " \
    ./usr/lib/arm-linux-gnueabihf/libevent_pthreads-2.0.so.5 \
    ./usr/lib/arm-linux-gnueabihf/libevent_pthreads-2.0.so.5.1.9 \
    ./usr/share/doc/libevent-pthreads-2.0-5/changelog.Debian.gz \
    ./usr/share/doc/libevent-pthreads-2.0-5/changelog.gz \
    ./usr/share/doc/libevent-pthreads-2.0-5/copyright\
"
#FAKE LICENSE FOR TESTING!!!
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COREBASE}/meta/COPYING.MIT;md5=3da9cfbcb788c80a0384361b4de20420"
