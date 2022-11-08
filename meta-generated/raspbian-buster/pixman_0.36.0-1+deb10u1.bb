PACKAGES = "${PN} libpixman-1-0"
PROVIDES = "libpixman-1-0"
SRC_URI = " \
	http://archive.raspbian.org/raspbian/pool/main/p/pixman/libpixman-1-0_0.36.0-1+deb10u1_armhf.deb;unpack=0;name=deb0\
"
DEBFILENAME_libpixman-1-0 = "libpixman-1-0_0.36.0-1+deb10u1_armhf.deb"
SRC_URI[deb0.sha256sum] = "02a83073b512ab0863dedace1599005a431643acbe56eaf0319e30611ccce729"
SRC_URI[deb0.md5sum] = "c196e910a56dbfea924cebd9ad73e752"

RDEPENDS_lib${PN}-1-0 = "libc6 (>= 2.4)"
DEPENDS = "libc6"


inherit deb_group

FILES_libpixman-1-0 = " \
    ./usr/lib/arm-linux-gnueabihf/libpixman-1.so.0 \
    ./usr/lib/arm-linux-gnueabihf/libpixman-1.so.0.36.0 \
    ./usr/share/doc/libpixman-1-0/changelog.Debian.gz \
    ./usr/share/doc/libpixman-1-0/copyright \
    ./usr/share/lintian/overrides/libpixman-1-0\
"
