PACKAGES = "${PN} libdb5.3"
PROVIDES = "libdb5.3"
SRC_URI = " \
	http://archive.raspbian.org/raspbian/pool/main/d/db5.3/libdb5.3_5.3.28+dfsg1-0.5_armhf.deb;unpack=0;name=deb0\
"
DEBFILENAME_libdb5.3 = "libdb5.3_5.3.28+dfsg1-0.5_armhf.deb"
SRC_URI[deb0.sha256sum] = "e9bfd3904dfbdab095f24f4e3d2736c1cabd0fc0a13c06239fc795dc3fd394fa"
SRC_URI[deb0.md5sum] = "c4ee58899213a7a9b600001deea42676"

RDEPENDS_lib${PN} = "libc6 (>= 2.28)"
DEPENDS = "libc6"


inherit deb_group

FILES_libdb5.3 = " \
    ./usr/lib/arm-linux-gnueabihf/libdb-5.3.so \
    ./usr/share/doc/libdb5.3/build_signature_armhf.txt \
    ./usr/share/doc/libdb5.3/changelog.Debian.gz \
    ./usr/share/doc/libdb5.3/copyright \
    ./usr/share/lintian/overrides/libdb5.3\
"
