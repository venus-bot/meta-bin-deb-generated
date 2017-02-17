PACKAGES = "libevent-2.0-5 libevent-core-2.0-5 libevent-dev libevent-extra-2.0-5 libevent-openssl-2.0-5 libevent-pthreads-2.0-5"
PROVIDES = "libevent-2.0-5 libevent-core-2.0-5 libevent-dev libevent-extra-2.0-5 libevent-openssl-2.0-5 libevent-pthreads-2.0-5"
SRC_URI = " \
	http://archive.raspbian.org/raspbian/pool/main/libe/libevent/libevent-2.0-5_2.0.21-stable-2+deb8u1_armhf.deb;unpack=0;name=deb0\
	http://archive.raspbian.org/raspbian/pool/main/libe/libevent/libevent-core-2.0-5_2.0.21-stable-2+deb8u1_armhf.deb;unpack=0;name=deb1\
	http://archive.raspbian.org/raspbian/pool/main/libe/libevent/libevent-dev_2.0.21-stable-2+deb8u1_armhf.deb;unpack=0;name=deb2\
	http://archive.raspbian.org/raspbian/pool/main/libe/libevent/libevent-extra-2.0-5_2.0.21-stable-2+deb8u1_armhf.deb;unpack=0;name=deb3\
	http://archive.raspbian.org/raspbian/pool/main/libe/libevent/libevent-openssl-2.0-5_2.0.21-stable-2+deb8u1_armhf.deb;unpack=0;name=deb4\
	http://archive.raspbian.org/raspbian/pool/main/libe/libevent/libevent-pthreads-2.0-5_2.0.21-stable-2+deb8u1_armhf.deb;unpack=0;name=deb5\
"
DEBFILENAME_libevent-2.0-5 = "libevent-2.0-5_2.0.21-stable-2+deb8u1_armhf.deb"
SRC_URI[deb0.sha256sum] = "c83e36936dc9075fa7026be90cd6678424e6f5ca78b20b0b2bfc2d9468b5af6d"
SRC_URI[deb0.md5sum] = "5e519084cc0bb268850fb9224c479d39"
DEBFILENAME_libevent-core-2.0-5 = "libevent-core-2.0-5_2.0.21-stable-2+deb8u1_armhf.deb"
SRC_URI[deb1.sha256sum] = "d6053f9dd3bee3796b911798ccb0ca562d2b6546cfd42e2fd13262fbb2dcd768"
SRC_URI[deb1.md5sum] = "bf796356f1930ff4cfb799322ec4e718"
DEBFILENAME_libevent-dev = "libevent-dev_2.0.21-stable-2+deb8u1_armhf.deb"
SRC_URI[deb2.sha256sum] = "826a6ee3e27e3f5e02b35afbd784f29f7dbc6e8a697b366a35cc6299bf7d64b4"
SRC_URI[deb2.md5sum] = "1086ae343bd11ffa2a03ba762fd0373d"
DEBFILENAME_libevent-extra-2.0-5 = "libevent-extra-2.0-5_2.0.21-stable-2+deb8u1_armhf.deb"
SRC_URI[deb3.sha256sum] = "c9c76eb2bd203966515f91a54bdef5f1d93187b77987071fb19d9be7d44ab6a4"
SRC_URI[deb3.md5sum] = "ab0a336c37b002888292eb4835b25e32"
DEBFILENAME_libevent-openssl-2.0-5 = "libevent-openssl-2.0-5_2.0.21-stable-2+deb8u1_armhf.deb"
SRC_URI[deb4.sha256sum] = "21001952ad6e95b78cb14aa28d6d05f433ebae4a57e501689fb4bdc48d6f9e20"
SRC_URI[deb4.md5sum] = "65f27748974bfa8ed6dcd8dc871e0162"
DEBFILENAME_libevent-pthreads-2.0-5 = "libevent-pthreads-2.0-5_2.0.21-stable-2+deb8u1_armhf.deb"
SRC_URI[deb5.sha256sum] = "ae136605a32a676396d6a5b8279a267a7bf0c258ae6c50fd62d25f99e4f23f8a"
SRC_URI[deb5.md5sum] = "0aff53c094ded83b0262124af11da604"

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
	./usr/share/doc/libevent-2.0-5/changelog.Debian.gz \
	./usr/lib/arm-linux-gnueabihf/libevent-2.0.so.5 \
	./usr/share/doc/libevent-2.0-5/changelog.gz \
	./usr/share/doc/libevent-2.0-5/copyright \
	./usr/lib/arm-linux-gnueabihf/libevent-2.0.so.5.1.9\
"
FILES_libevent-core-2.0-5 = " \
	./usr/share/doc/libevent-core-2.0-5/changelog.Debian.gz \
	./usr/lib/arm-linux-gnueabihf/libevent_core-2.0.so.5 \
	./usr/share/doc/libevent-core-2.0-5/copyright \
	./usr/lib/arm-linux-gnueabihf/libevent_core-2.0.so.5.1.9 \
	./usr/share/doc/libevent-core-2.0-5/changelog.gz\
"
FILES_${PN}-dev = " \
	./usr/share/doc/libevent-dev/changelog.gz \
	./usr/lib/arm-linux-gnueabihf/libevent_pthreads.so \
	./usr/include/event2/http.h \
	./usr/include/event2/bufferevent_ssl.h \
	./usr/include/event2/tag.h \
	./usr/lib/arm-linux-gnueabihf/libevent.a \
	./usr/share/doc/libevent-dev/examples/event-test.c \
	./usr/include/event2/util.h \
	./usr/include/event2/dns_struct.h \
	./usr/include/event2/event.h \
	./usr/lib/arm-linux-gnueabihf/libevent_extra.a \
	./usr/lib/arm-linux-gnueabihf/libevent.so \
	./usr/include/event2/event_struct.h \
	./usr/include/event2/dns_compat.h \
	./usr/lib/arm-linux-gnueabihf/libevent_openssl.a \
	./usr/include/event2/tag_compat.h \
	./usr/share/doc/libevent-dev/copyright \
	./usr/lib/arm-linux-gnueabihf/libevent_pthreads.a \
	./usr/include/evutil.h \
	./usr/lib/arm-linux-gnueabihf/libevent_openssl.so \
	./usr/share/doc/libevent-dev/examples/le-proxy.c.gz \
	./usr/include/evhttp.h \
	./usr/share/doc/libevent-dev/examples/Makefile.sample \
	./usr/lib/arm-linux-gnueabihf/libevent_core.so \
	./usr/include/event2/bufferevent.h \
	./usr/lib/arm-linux-gnueabihf/libevent_extra.so \
	./usr/share/doc/libevent-dev/TODO.Debian \
	./usr/include/event.h \
	./usr/include/evrpc.h \
	./usr/share/doc/libevent-dev/examples/hello-world.c \
	./usr/share/doc/libevent-dev/changelog.Debian.gz \
	./usr/share/doc/libevent-dev/examples/signal-test.c \
	./usr/lib/arm-linux-gnueabihf/pkgconfig/libevent_pthreads.pc \
	./usr/include/event2/event_compat.h \
	./usr/include/event2/event-config.h \
	./usr/include/event2/rpc_struct.h \
	./usr/include/event2/rpc_compat.h \
	./usr/include/evdns.h \
	./usr/include/event2/rpc.h \
	./usr/share/doc/libevent-dev/examples/http-server.c.gz \
	./usr/include/event2/http_struct.h \
	./usr/include/event2/keyvalq_struct.h \
	./usr/share/doc/libevent-dev/examples/time-test.c \
	./usr/share/doc/libevent-dev/examples/dns-example.c.gz \
	./usr/lib/arm-linux-gnueabihf/pkgconfig/libevent_openssl.pc \
	./usr/lib/arm-linux-gnueabihf/libevent_core.a \
	./usr/include/event2/bufferevent_compat.h \
	./usr/include/event2/buffer.h \
	./usr/lib/arm-linux-gnueabihf/pkgconfig/libevent.pc \
	./usr/include/event2/listener.h \
	./usr/share/doc/libevent-dev/whatsnew-2.0.txt.gz \
	./usr/include/event2/buffer_compat.h \
	./usr/include/event2/bufferevent_struct.h \
	./usr/include/event2/dns.h \
	./usr/include/event2/thread.h \
	./usr/include/event2/http_compat.h\
"
FILES_libevent-extra-2.0-5 = " \
	./usr/share/doc/libevent-extra-2.0-5/changelog.gz \
	./usr/share/doc/libevent-extra-2.0-5/copyright \
	./usr/share/doc/libevent-extra-2.0-5/changelog.Debian.gz \
	./usr/lib/arm-linux-gnueabihf/libevent_extra-2.0.so.5.1.9 \
	./usr/lib/arm-linux-gnueabihf/libevent_extra-2.0.so.5\
"
FILES_libevent-openssl-2.0-5 = " \
	./usr/share/doc/libevent-openssl-2.0-5/changelog.Debian.gz \
	./usr/share/doc/libevent-openssl-2.0-5/changelog.gz \
	./usr/share/doc/libevent-openssl-2.0-5/copyright \
	./usr/lib/arm-linux-gnueabihf/libevent_openssl-2.0.so.5 \
	./usr/lib/arm-linux-gnueabihf/libevent_openssl-2.0.so.5.1.9\
"
FILES_libevent-pthreads-2.0-5 = " \
	./usr/lib/arm-linux-gnueabihf/libevent_pthreads-2.0.so.5.1.9 \
	./usr/lib/arm-linux-gnueabihf/libevent_pthreads-2.0.so.5 \
	./usr/share/doc/libevent-pthreads-2.0-5/changelog.Debian.gz \
	./usr/share/doc/libevent-pthreads-2.0-5/copyright \
	./usr/share/doc/libevent-pthreads-2.0-5/changelog.gz\
"
#FAKE LICENSE FOR TESTING!!!
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COREBASE}/meta/COPYING.MIT;md5=3da9cfbcb788c80a0384361b4de20420"
