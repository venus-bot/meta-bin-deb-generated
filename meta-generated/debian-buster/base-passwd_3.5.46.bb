PACKAGES = "${PN} base-passwd"
PROVIDES = "base-passwd"
SRC_URI = " \
	http://ftp.de.debian.org/debian/pool/main/b/base-passwd/base-passwd_3.5.46_armhf.deb;unpack=0;name=deb0\
"
DEBFILENAME_base-passwd = "base-passwd_3.5.46_armhf.deb"
SRC_URI[deb0.sha256sum] = "409d66e15b3249e1261fa5ab0faa71f80da6e55c10e963985bfb4e066a4a7c02"
SRC_URI[deb0.md5sum] = "f0eed82c16de10751ecb1480f97f839a"

RDEPENDS_${PN} = "libc6 (>= 2.8) libdebconfclient0 (>= 0.145)"
DEPENDS = "libc6 libdebconfclient0"


inherit deb_group

FILES_${PN} = " \
    ./usr/sbin/update-passwd \
    ./usr/share/base-passwd/group.master \
    ./usr/share/base-passwd/passwd.master \
    ./usr/share/doc-base/users-and-groups \
    ./usr/share/doc/base-passwd/README \
    ./usr/share/doc/base-passwd/changelog.gz \
    ./usr/share/doc/base-passwd/copyright \
    ./usr/share/doc/base-passwd/users-and-groups.html \
    ./usr/share/doc/base-passwd/users-and-groups.txt.gz \
    ./usr/share/lintian/overrides/base-passwd \
    ./usr/share/man/de/man8/update-passwd.8.gz \
    ./usr/share/man/es/man8/update-passwd.8.gz \
    ./usr/share/man/fr/man8/update-passwd.8.gz \
    ./usr/share/man/ja/man8/update-passwd.8.gz \
    ./usr/share/man/man8/update-passwd.8.gz \
    ./usr/share/man/pl/man8/update-passwd.8.gz \
    ./usr/share/man/ru/man8/update-passwd.8.gz\
"
