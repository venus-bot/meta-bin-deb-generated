PACKAGES = "${PN} libwebsockets8"
PROVIDES = "libwebsockets8"
SRC_URI = " \
	http://archive.raspbian.org/raspbian/pool/main/libw/libwebsockets/libwebsockets8_2.0.3-3_armhf.deb;unpack=0;name=deb0\
"
DEBFILENAME_libwebsockets8 = "libwebsockets8_2.0.3-3_armhf.deb"
SRC_URI[deb0.sha256sum] = "86e7d8994fa9f5800f2e7905bb456cb6ae4cc8190f37dc8c13d6ad38f8abafdd"
SRC_URI[deb0.md5sum] = "ea1d17ddbef6276e365f09389fc016d7"

RDEPENDS_${PN}8 = "libc6 (>= 2.4) libev4 (>= 1:4.04) libssl1.1 (>= 1.1.0) libuv1 (>= 1.4.2) zlib1g (>= 1:1.1.4)"
DEPENDS = "libc6 libev4 libssl1.1 libuv1 zlib1g"


inherit deb_group

FILES_libwebsockets8 = " \
    ./usr/lib/arm-linux-gnueabihf/libwebsockets.so.8 \
    ./usr/share/doc/libwebsockets8/changelog.Debian.gz \
    ./usr/share/doc/libwebsockets8/changelog.gz \
    ./usr/share/doc/libwebsockets8/copyright \
    ./usr/share/lintian/overrides/libwebsockets8\
"
