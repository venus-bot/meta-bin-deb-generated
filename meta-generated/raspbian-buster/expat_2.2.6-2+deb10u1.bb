PACKAGES = "${PN} libexpat1"
PROVIDES = "libexpat1"
SRC_URI = " \
	http://archive.raspbian.org/raspbian/pool/main/e/expat/libexpat1_2.2.6-2+deb10u1_armhf.deb;unpack=0;name=deb0\
"
DEBFILENAME_libexpat1 = "libexpat1_2.2.6-2+deb10u1_armhf.deb"
SRC_URI[deb0.sha256sum] = "869f0de1b5548c13e395554f454dcd17398479e12b5b1e7079fd8e5246113365"
SRC_URI[deb0.md5sum] = "272f63610970a61aae4d2b33279db7bc"

RDEPENDS_lib${PN}1 = "libc6 (>= 2.25) libgcc1 (>= 1:3.5)"
DEPENDS = "libc6 libgcc1"


inherit deb_group

FILES_libexpat1 = " \
    ./lib/arm-linux-gnueabihf/libexpat.so.1 \
    ./lib/arm-linux-gnueabihf/libexpat.so.1.6.8 \
    ./usr/lib/arm-linux-gnueabihf/libexpatw.so.1 \
    ./usr/lib/arm-linux-gnueabihf/libexpatw.so.1.6.8 \
    ./usr/share/doc/libexpat1/AUTHORS \
    ./usr/share/doc/libexpat1/changelog.Debian.gz \
    ./usr/share/doc/libexpat1/changelog.gz \
    ./usr/share/doc/libexpat1/copyright\
"
