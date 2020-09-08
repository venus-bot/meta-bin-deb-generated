PACKAGES = "${PN} libdb5.3"
PROVIDES = "libdb5.3"
SRC_URI = " \
	http://ftp.de.debian.org/debian/pool/main/d/db5.3/libdb5.3_5.3.28+dfsg1-0.5_armhf.deb;unpack=0;name=deb0\
"
DEBFILENAME_libdb5.3 = "libdb5.3_5.3.28+dfsg1-0.5_armhf.deb"
SRC_URI[deb0.sha256sum] = "d34c3f927b13c17550313dd314cb064b66846279afd032574bff16aab62f0697"
SRC_URI[deb0.md5sum] = "dabfef6b4077c8603ffccd8416d34dd1"

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
