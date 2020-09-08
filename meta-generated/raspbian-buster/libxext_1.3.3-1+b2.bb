PACKAGES = "${PN} libxext6"
PROVIDES = "libxext6"
SRC_URI = " \
	http://archive.raspbian.org/raspbian/pool/main/libx/libxext/libxext6_1.3.3-1+b2_armhf.deb;unpack=0;name=deb0\
"
DEBFILENAME_libxext6 = "libxext6_1.3.3-1+b2_armhf.deb"
SRC_URI[deb0.sha256sum] = "4cff4cba6aae865ca4d5e72061d51c16c87985de0232751afce0d05909c755cc"
SRC_URI[deb0.md5sum] = "d14de9d05dc9dd1efb8f16b585bb5ba1"

RDEPENDS_${PN}6 = "libc6 (>= 2.4) libx11-6 (>= 2:1.6.0)"
DEPENDS = "libc6 libx11-6"


inherit deb_group

FILES_libxext6 = " \
    ./usr/lib/arm-linux-gnueabihf/libXext.so.6 \
    ./usr/lib/arm-linux-gnueabihf/libXext.so.6.4.0 \
    ./usr/share/doc/libxext6/changelog.Debian.armhf.gz \
    ./usr/share/doc/libxext6/changelog.Debian.gz \
    ./usr/share/doc/libxext6/changelog.gz \
    ./usr/share/doc/libxext6/copyright\
"
