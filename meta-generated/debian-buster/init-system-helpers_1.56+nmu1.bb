PACKAGES = "${PN} init-system-helpers"
PROVIDES = "init-system-helpers"
SRC_URI = " \
	http://ftp.de.debian.org/debian/pool/main/i/init-system-helpers/init-system-helpers_1.56+nmu1_all.deb;unpack=0;name=deb0\
"
DEBFILENAME_init-system-helpers = "init-system-helpers_1.56+nmu1_all.deb"
SRC_URI[deb0.sha256sum] = "c457150e2faa01e6677a1d91aa76a868d2b7114deb17ade2ccc2b99235310805"
SRC_URI[deb0.md5sum] = "56f7cf7aea963969b827d8782599320d"

RDEPENDS_${PN} = "perl-base (>= 5.20.1-3)"
DEPENDS = "perl-base"


inherit deb_group

FILES_${PN} = " \
    ./usr/bin/deb-systemd-helper \
    ./usr/bin/deb-systemd-invoke \
    ./usr/sbin/invoke-rc.d \
    ./usr/sbin/service \
    ./usr/sbin/update-rc.d \
    ./usr/share/bug/init-system-helpers/control \
    ./usr/share/doc/init-system-helpers/README.invoke-rc.d.gz \
    ./usr/share/doc/init-system-helpers/README.policy-rc.d.gz \
    ./usr/share/doc/init-system-helpers/changelog.gz \
    ./usr/share/doc/init-system-helpers/copyright \
    ./usr/share/lintian/overrides/init-system-helpers \
    ./usr/share/man/man1/deb-systemd-helper.1p.gz \
    ./usr/share/man/man1/deb-systemd-invoke.1p.gz \
    ./usr/share/man/man8/invoke-rc.d.8.gz \
    ./usr/share/man/man8/service.8.gz \
    ./usr/share/man/man8/update-rc.d.8.gz\
"
