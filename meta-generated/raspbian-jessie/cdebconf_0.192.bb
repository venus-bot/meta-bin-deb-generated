PACKAGES = "${PN} libdebconfclient0"
PROVIDES = "libdebconfclient0"
SRC_URI = " \
	http://archive.raspbian.org/raspbian/pool/main/c/cdebconf/libdebconfclient0_0.192_armhf.deb;unpack=0;name=deb0\
"
DEBFILENAME_libdebconfclient0 = "libdebconfclient0_0.192_armhf.deb"
SRC_URI[deb0.sha256sum] = "a4cd2cb1c5a23b1c3ed37e6dcfa982b86c2570a69bd1997f25c1d1dd9cf7f3c2"
SRC_URI[deb0.md5sum] = "c7a84cb26e36564c3a96880ea1937a04"

RDEPENDS_libdebconfclient0 = "libc6 (>= 2.4) multiarch-support"
DEPENDS = "libc6 multiarch-support"


inherit deb_group

FILES_libdebconfclient0 = " \
    ./usr/lib/arm-linux-gnueabihf/libdebconfclient.so.0 \
    ./usr/lib/arm-linux-gnueabihf/libdebconfclient.so.0.0.0 \
    ./usr/share/doc/libdebconfclient0/changelog.gz \
    ./usr/share/doc/libdebconfclient0/copyright\
"
