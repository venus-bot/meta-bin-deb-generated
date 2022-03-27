PACKAGES = "${PN} libgmp10"
PROVIDES = "libgmp10"
SRC_URI = " \
	http://archive.raspbian.org/raspbian/pool/main/g/gmp/libgmp10_6.1.2+dfsg-4+deb10u1_armhf.deb;unpack=0;name=deb0\
"
DEBFILENAME_libgmp10 = "libgmp10_6.1.2+dfsg-4+deb10u1_armhf.deb"
SRC_URI[deb0.sha256sum] = "5420eba9581ce231bedb6ad22ff70ad2adb052afca204eb1ecb057bbb380ebdb"
SRC_URI[deb0.md5sum] = "67ace8705968f66bba4bbd68cb089a0b"

RDEPENDS_lib${PN}10 = "libc6 (>= 2.7)"
DEPENDS = "libc6"


inherit deb_group

FILES_libgmp10 = " \
    ./usr/lib/arm-linux-gnueabihf/libgmp.so.10 \
    ./usr/lib/arm-linux-gnueabihf/libgmp.so.10.3.2 \
    ./usr/share/doc/libgmp10/README.Debian \
    ./usr/share/doc/libgmp10/changelog.Debian.gz \
    ./usr/share/doc/libgmp10/copyright\
"
