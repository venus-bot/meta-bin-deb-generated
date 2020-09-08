PACKAGES = "${PN} libhogweed4 libnettle6"
PROVIDES = "libhogweed4 libnettle6"
SRC_URI = " \
	http://archive.raspbian.org/raspbian/pool/main/n/nettle/libhogweed4_3.4.1-1_armhf.deb;unpack=0;name=deb0\
	http://archive.raspbian.org/raspbian/pool/main/n/nettle/libnettle6_3.4.1-1_armhf.deb;unpack=0;name=deb1\
"
DEBFILENAME_libhogweed4 = "libhogweed4_3.4.1-1_armhf.deb"
SRC_URI[deb0.sha256sum] = "9eafecd38110191e285293a770eb13ef7a291cea2e0ff18cf511c6cf21b947b6"
SRC_URI[deb0.md5sum] = "14c2cc694ae1dcf0243745e685b2c589"
DEBFILENAME_libnettle6 = "libnettle6_3.4.1-1_armhf.deb"
SRC_URI[deb1.sha256sum] = "49010bb7544c086eb20d5330fd1b1bce61bf29f66f0bfe7da5381f1ddcc6abf0"
SRC_URI[deb1.md5sum] = "4d899486dc20d80d69f0a73311db7480"

RDEPENDS_libhogweed4 = "libc6 (>= 2.4) libgmp10 (>= 2:6.0.0) libnettle6 (= 3.4.1-1)"
RDEPENDS_lib${PN}6 = "libc6 (>= 2.4)"
DEPENDS = "libc6 libgmp10"


inherit deb_group

FILES_libhogweed4 = " \
    ./usr/lib/arm-linux-gnueabihf/libhogweed.so.4 \
    ./usr/lib/arm-linux-gnueabihf/libhogweed.so.4.5 \
    ./usr/share/doc/libhogweed4\
"
FILES_libnettle6 = " \
    ./usr/lib/arm-linux-gnueabihf/libnettle.so.6 \
    ./usr/lib/arm-linux-gnueabihf/libnettle.so.6.5 \
    ./usr/share/doc/libnettle6/NEWS.gz \
    ./usr/share/doc/libnettle6/README \
    ./usr/share/doc/libnettle6/changelog.Debian.gz \
    ./usr/share/doc/libnettle6/changelog.gz \
    ./usr/share/doc/libnettle6/copyright\
"
