PACKAGES = "${PN} libexpat1"
PROVIDES = "libexpat1"
SRC_URI = " \
	http://archive.raspbian.org/raspbian/pool/main/e/expat/libexpat1_2.1.0-6+deb8u6_armhf.deb;unpack=0;name=deb0\
"
DEBFILENAME_libexpat1 = "libexpat1_2.1.0-6+deb8u6_armhf.deb"
SRC_URI[deb0.sha256sum] = "c05be26024a5cad9c93f6887c381144b8f3281101880348017629ee2303eb734"
SRC_URI[deb0.md5sum] = "0a6a35ae7a2ea909de03ecfecd88d668"

RDEPENDS_lib${PN}1 = "libc6 (>= 2.4) libgcc1 (>= 1:4.4.0) multiarch-support"
DEPENDS = "libc6 libgcc1 multiarch-support"


inherit deb_group

FILES_libexpat1 = " \
    ./lib/arm-linux-gnueabihf/libexpat.so.1 \
    ./lib/arm-linux-gnueabihf/libexpat.so.1.6.0 \
    ./usr/lib/arm-linux-gnueabihf/libexpatw.so.1 \
    ./usr/lib/arm-linux-gnueabihf/libexpatw.so.1.6.0 \
    ./usr/share/doc/libexpat1/changelog.Debian.gz \
    ./usr/share/doc/libexpat1/changelog.gz \
    ./usr/share/doc/libexpat1/copyright\
"
