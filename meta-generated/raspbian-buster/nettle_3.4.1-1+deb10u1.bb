PACKAGES = "${PN} libhogweed4 libnettle6"
PROVIDES = "libhogweed4 libnettle6"
SRC_URI = " \
	http://archive.raspbian.org/raspbian/pool/main/n/nettle/libhogweed4_3.4.1-1+deb10u1_armhf.deb;unpack=0;name=deb0\
	http://archive.raspbian.org/raspbian/pool/main/n/nettle/libnettle6_3.4.1-1+deb10u1_armhf.deb;unpack=0;name=deb1\
"
DEBFILENAME_libhogweed4 = "libhogweed4_3.4.1-1+deb10u1_armhf.deb"
SRC_URI[deb0.sha256sum] = "bb8bb601e6a45b4865e18c7c7f9ea34ebc3b85c79037d9c3b742c6850e8193fb"
SRC_URI[deb0.md5sum] = "d398c685976d9bd07aaa79eb7a4e5a9f"
DEBFILENAME_libnettle6 = "libnettle6_3.4.1-1+deb10u1_armhf.deb"
SRC_URI[deb1.sha256sum] = "e39f7c1811b10749e5e341cb36082708db9e4571ec2c6c04c94d01b1de61d7b3"
SRC_URI[deb1.md5sum] = "64b2a06a717e0018cbb14b4b9c417146"

RDEPENDS_libhogweed4 = "libc6 (>= 2.4) libgmp10 (>= 2:6.0.0) libnettle6 (= 3.4.1-1+deb10u1)"
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
