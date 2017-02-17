PACKAGES = "libevent-2.0-5 libevent-core-2.0-5 libevent-dev libevent-extra-2.0-5 libevent-openssl-2.0-5 libevent-pthreads-2.0-5"
PROVIDES = "libevent-2.0-5 libevent-core-2.0-5 libevent-dev libevent-extra-2.0-5 libevent-openssl-2.0-5 libevent-pthreads-2.0-5"
SRC_URI = " \
	http://archive.raspbian.org/raspbian/pool/main/libe/libevent/libevent-2.0-5_2.0.19-stable-3+deb7u2_armhf.deb;unpack=0;name=deb0\
	http://archive.raspbian.org/raspbian/pool/main/libe/libevent/libevent-core-2.0-5_2.0.19-stable-3+deb7u2_armhf.deb;unpack=0;name=deb1\
	http://archive.raspbian.org/raspbian/pool/main/libe/libevent/libevent-dev_2.0.19-stable-3+deb7u2_armhf.deb;unpack=0;name=deb2\
	http://archive.raspbian.org/raspbian/pool/main/libe/libevent/libevent-extra-2.0-5_2.0.19-stable-3+deb7u2_armhf.deb;unpack=0;name=deb3\
	http://archive.raspbian.org/raspbian/pool/main/libe/libevent/libevent-openssl-2.0-5_2.0.19-stable-3+deb7u2_armhf.deb;unpack=0;name=deb4\
	http://archive.raspbian.org/raspbian/pool/main/libe/libevent/libevent-pthreads-2.0-5_2.0.19-stable-3+deb7u2_armhf.deb;unpack=0;name=deb5\
"
DEBFILENAME_libevent-2.0-5 = "libevent-2.0-5_2.0.19-stable-3+deb7u2_armhf.deb"
SRC_URI[deb0.sha256sum] = "f182085e07552fb3a56e3f345b4002f7b9842597ea6eeb22c2ed44b901930772"
SRC_URI[deb0.md5sum] = "5530c22bd45ae0ea3bee0878ec377373"
DEBFILENAME_libevent-core-2.0-5 = "libevent-core-2.0-5_2.0.19-stable-3+deb7u2_armhf.deb"
SRC_URI[deb1.sha256sum] = "cd12aee6fd90f877f177457855d90c4f11344a10ca26549fc9e15c8a59cdfe6f"
SRC_URI[deb1.md5sum] = "8091547432863003df5a57fbcd4baee0"
DEBFILENAME_libevent-dev = "libevent-dev_2.0.19-stable-3+deb7u2_armhf.deb"
SRC_URI[deb2.sha256sum] = "ec3a56b22b42f2e9af61661a0699812293c23faf130962f4143cf264cd195b91"
SRC_URI[deb2.md5sum] = "a2a9574d27a3e4982b00d43a33b5aad0"
DEBFILENAME_libevent-extra-2.0-5 = "libevent-extra-2.0-5_2.0.19-stable-3+deb7u2_armhf.deb"
SRC_URI[deb3.sha256sum] = "d51bbd6f1acc078dc925a364febecd8483b99124f7d24b59d6788d587d4c6215"
SRC_URI[deb3.md5sum] = "ad318d84b37db549cd391d98500f9081"
DEBFILENAME_libevent-openssl-2.0-5 = "libevent-openssl-2.0-5_2.0.19-stable-3+deb7u2_armhf.deb"
SRC_URI[deb4.sha256sum] = "25adcc19956a47d4e1013fdeda5f66c8168f63d2d2094c5ca0713ae5cf9cf04f"
SRC_URI[deb4.md5sum] = "5ace7ee16d9ce1c2c6d2ac11d3ab043b"
DEBFILENAME_libevent-pthreads-2.0-5 = "libevent-pthreads-2.0-5_2.0.19-stable-3+deb7u2_armhf.deb"
SRC_URI[deb5.sha256sum] = "777d3a66bcc929e9841d4e203268517e5c786c9bc97e4996400499e9888339d6"
SRC_URI[deb5.md5sum] = "1d3894f2464970e3b77dbd743c3b6234"

RDEPENDS_${PN}-2.0-5 = "libc6 (>= 2.13-28) libgcc1 (>= 1:4.4.0)"
RDEPENDS_${PN}-core-2.0-5 = "libc6 (>= 2.13-28) libgcc1 (>= 1:4.4.0)"
RDEPENDS_${PN}-dev = "libevent-2.0-5 (= 2.0.19-stable-3+deb7u2) libevent-core-2.0-5 (= 2.0.19-stable-3+deb7u2) libevent-extra-2.0-5 (= 2.0.19-stable-3+deb7u2) libevent-pthreads-2.0-5 (= 2.0.19-stable-3+deb7u2) libevent-openssl-2.0-5 (= 2.0.19-stable-3+deb7u2)"
RDEPENDS_${PN}-extra-2.0-5 = "libc6 (>= 2.13-28) libevent-core-2.0-5 (= 2.0.19-stable-3+deb7u2)"
RDEPENDS_${PN}-openssl-2.0-5 = "libc6 (>= 2.13-28) libevent-core-2.0-5 (= 2.0.19-stable-3+deb7u2) libssl1.0.0 (>= 1.0.0)"
RDEPENDS_${PN}-pthreads-2.0-5 = "libc6 (>= 2.13-28) libevent-core-2.0-5 (= 2.0.19-stable-3+deb7u2)"
DEPENDS = "libgcc1 libssl1.0.0 libc6"


inherit deb_group

# Prebuilt binaries, no need for any default dependencies
INHIBIT_DEFAULT_DEPS = "1"
INHIBIT_PACKAGE_STRIP = "1"
INSANE_SKIP_${PN} += "already-stripped"

FILES_libevent-2.0-5 = " \
	./usr/lib/arm-linux-gnueabihf/libevent-2.0.so.5.1.7 \
	./usr/share/doc/libevent-2.0-5/changelog.Debian.gz \
	./usr/share/doc/libevent-2.0-5/copyright \
	./usr/share/doc/libevent-2.0-5/changelog.gz \
	./usr/lib/arm-linux-gnueabihf/libevent-2.0.so.5\
"
FILES_libevent-core-2.0-5 = " \
	./usr/share/doc/libevent-core-2.0-5/changelog.Debian.gz \
	./usr/lib/arm-linux-gnueabihf/libevent_core-2.0.so.5.1.7 \
	./usr/share/doc/libevent-core-2.0-5/copyright \
	./usr/lib/arm-linux-gnueabihf/libevent_core-2.0.so.5 \
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
	./usr/lib/arm-linux-gnueabihf/libevent_extra-2.0.so.5.1.7 \
	./usr/lib/arm-linux-gnueabihf/libevent_extra-2.0.so.5 \
	./usr/share/doc/libevent-extra-2.0-5/changelog.Debian.gz\
"
FILES_libevent-openssl-2.0-5 = " \
	./usr/lib/arm-linux-gnueabihf/libevent_openssl-2.0.so.5.1.7 \
	./usr/share/doc/libevent-openssl-2.0-5/changelog.gz \
	./usr/share/doc/libevent-openssl-2.0-5/copyright \
	./usr/lib/arm-linux-gnueabihf/libevent_openssl-2.0.so.5 \
	./usr/share/doc/libevent-openssl-2.0-5/changelog.Debian.gz\
"
FILES_libevent-pthreads-2.0-5 = " \
	./usr/share/doc/libevent-pthreads-2.0-5/changelog.Debian.gz \
	./usr/lib/arm-linux-gnueabihf/libevent_pthreads-2.0.so.5 \
	./usr/lib/arm-linux-gnueabihf/libevent_pthreads-2.0.so.5.1.7 \
	./usr/share/doc/libevent-pthreads-2.0-5/copyright \
	./usr/share/doc/libevent-pthreads-2.0-5/changelog.gz\
"
#FAKE LICENSE FOR TESTING!!!
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COREBASE}/meta/COPYING.MIT;md5=3da9cfbcb788c80a0384361b4de20420"
