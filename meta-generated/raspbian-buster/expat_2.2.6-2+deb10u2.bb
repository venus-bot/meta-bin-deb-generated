PACKAGES = "${PN} libexpat1"
PROVIDES = "libexpat1"
SRC_URI = " \
	http://archive.raspbian.org/raspbian/pool/main/e/expat/libexpat1_2.2.6-2+deb10u2_armhf.deb;unpack=0;name=deb0\
"
DEBFILENAME_libexpat1 = "libexpat1_2.2.6-2+deb10u2_armhf.deb"
SRC_URI[deb0.sha256sum] = "3996987901554f1e0bcc849a0113f350516e654594b0b231929db1b17481dd86"
SRC_URI[deb0.md5sum] = "1a3ed9fd97b96ebf99fc2a842de0b0a0"

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
