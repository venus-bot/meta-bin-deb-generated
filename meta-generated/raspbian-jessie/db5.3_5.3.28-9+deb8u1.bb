PACKAGES = "${PN} libdb5.3"
PROVIDES = "libdb5.3"
SRC_URI = " \
	http://archive.raspbian.org/raspbian/pool/main/d/db5.3/libdb5.3_5.3.28-9+deb8u1_armhf.deb;unpack=0;name=deb0\
"
DEBFILENAME_libdb5.3 = "libdb5.3_5.3.28-9+deb8u1_armhf.deb"
SRC_URI[deb0.sha256sum] = "a4168f3f340ee0d6f4ead6957147d76ec8c1265851a404547dcdd7f98e8b71af"
SRC_URI[deb0.md5sum] = "d44b7e8005a7c39fbc79eaa5b7f0cb68"

RDEPENDS_lib${PN} = "libc6 (>= 2.17) multiarch-support"
DEPENDS = "libc6 multiarch-support"


inherit deb_group

FILES_libdb5.3 = " \
    ./usr/lib/arm-linux-gnueabihf/libdb-5.3.so \
    ./usr/share/doc/libdb5.3/build_signature_armhf.txt \
    ./usr/share/doc/libdb5.3/changelog.Debian.gz \
    ./usr/share/doc/libdb5.3/copyright \
    ./usr/share/lintian/overrides/libdb5.3\
"
